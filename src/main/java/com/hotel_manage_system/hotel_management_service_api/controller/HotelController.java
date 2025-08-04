package com.hotel_manage_system.hotel_management_service_api.controller;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.hotel_manage_system.hotel_management_service_api.service.HotelService;
import com.hotel_manage_system.hotel_management_service_api.util.StandardResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotel-management/api/v1/hotels")
public class HotelController {

    private final HotelService hotelService;

 @PostMapping("/user/create")
    public ResponseEntity<StandardResponseDto> create(@RequestBody RequestHotelDto dto){
     return new ResponseEntity<>(new StandardResponseDto(
             201,"Hotel created successfully",null)
             ,HttpStatus.CREATED);
 }


@PutMapping("/admin/update/{id}")
    public ResponseEntity<StandardResponseDto> update(@RequestBody RequestHotelDto dto,@PathVariable("id") String hotelId){
     return new ResponseEntity<>(new StandardResponseDto(
             201,"Hotel updated successfully",null)
             ,HttpStatus.CREATED);
 }


    @DeleteMapping("/host/delete/{id}")
    public ResponseEntity<StandardResponseDto> delete(@PathVariable("id") String hotelId) {
        hotelService.delete(hotelId);
        return new ResponseEntity<>(
                new StandardResponseDto(204, "Hotel deleted successfully", null),
                HttpStatus.NO_CONTENT
        );
    }


    @GetMapping("/visitor/find-by-id/{id}")
    public ResponseEntity<StandardResponseDto> findById(@PathVariable("id") String hotelId) throws SQLException {
        return new ResponseEntity<>(
                new StandardResponseDto(200, "Hotel fetched successfully", hotelService.findById(hotelId)),
                HttpStatus.OK
        );
    }



    @GetMapping ("/visitor/find-all")
    public ResponseEntity<StandardResponseDto> findAll(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size
    ){
        return new ResponseEntity<>(new StandardResponseDto(
                200,"Hotel list fetched successfully",hotelService.findAll(page,size,searchText))
                ,HttpStatus.OK);
    }






}
