package com.hotel_manage_system.hotel_management_service_api.service.impl;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.HotelPaginateResponseDto;
import com.hotel_manage_system.hotel_management_service_api.entity.Branch;
import com.hotel_manage_system.hotel_management_service_api.entity.Hotel;
import com.hotel_manage_system.hotel_management_service_api.exeption.EntryNotFoundExeption;
import com.hotel_manage_system.hotel_management_service_api.repo.HotelRepo;
import com.hotel_manage_system.hotel_management_service_api.service.HotelService;
import com.hotel_manage_system.hotel_management_service_api.util.ByteCodeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepo hotelRepo;
    private final ByteCodeHandler byteCodeHandler;



    @Override
    public void create(RequestHotelDto dto) throws SQLException {
        hotelRepo.save(toHotel(dto));
    }



    @Override
    public void update(RequestHotelDto dto, String hotelId) throws SQLException {
      Hotel selectedHotel = hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundExeption("hotel not found"));
      selectedHotel.setHotelName(dto.getHotelName());
      selectedHotel.setUpdatedAt(LocalDateTime.now());
      selectedHotel.setDescription(byteCodeHandler.stringToBlob(dto.getDescription()));
      selectedHotel.setStartRating(dto.getStarRating());
      selectedHotel.setStartingfom(dto.getStartingFrom());
      hotelRepo.save(selectedHotel);
    }



    @Override
    public void delete(String hotelId) {
        hotelRepo.findById(hotelId).orElseThrow(() -> new EntryNotFoundExeption("Hotel not found"));
        hotelRepo.deleteById(hotelId);
    }



    @Override
    public ResponseHotelDto findById(String hotelId) throws SQLException {
        Hotel selectedHotel = hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundExeption("hotel not found"));
        return toResponseHotelDto(selectedHotel);
    }




    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return HotelPaginateResponseDto.builder()
                .dataCount(hotelRepo.countAllHotels(searchText))
                .dataList(
                        hotelRepo.searchAllHotels(searchText, PageRequest.of(page,size))
                                .stream()
                                .map(e-> {
                                    try {
                                        return toResponseHotelDto(e);
                                    } catch (SQLException ex) {
                                        throw new RuntimeException(ex);
                                    }
                                }).collect(Collectors.toList())
                )
                .build();
    }





    private Hotel toHotel(RequestHotelDto dto) throws SQLException {
        return dto== null?null:
                Hotel.builder()
                        .hotelName(dto.getHotelName())
                        .hotelId(UUID.randomUUID().toString())
                        .startRating(dto.getStarRating())
                        .description(byteCodeHandler.stringToBlob(dto.getDescription()))   //converting string to blob
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .activeStatus(true)
                        .startingfom(dto.getStartingFrom())

                        .build();
    }

    private ResponseHotelDto toResponseHotelDto(Hotel hotel) throws SQLException {
        return hotel== null?null:
                ResponseHotelDto.builder()
                        .hotelName(hotel.getHotelName())
                        .hotelId(hotel.getHotelId())
                        .starRating(hotel.getStartRating())
                        .description(byteCodeHandler.blobToString(hotel.getDescription()))   //converting  blob to string
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .activeStatus(hotel.isActiveStatus())
                        .startingFrom(hotel.getStartingfom())
                        .branches(
                                hotel.getBranches().stream().map(e-> {
                                    try {
                                        return toResponseBranchDto(e);
                                    } catch (SQLException ex) {
                                        throw new RuntimeException(ex);
                                    }
                                }).toList()
                        )
                        .build();
    }

    private ResponseBranchDto toResponseBranchDto(Branch branch) throws SQLException {
        return  branch == null?null:
                ResponseBranchDto.builder()
                        .branchId(branch.getBranchId())
                        .branchName(branch.getBranchName())
                        .roomCount(branch.getRoomCount())
                        .branchType(branch.getBranchType())  //hotel kiyanaeka onn na
                        .build();
    }



}
