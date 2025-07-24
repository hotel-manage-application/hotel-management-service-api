package com.hotel_manage_system.hotel_management_service_api.service.impl;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.HotelPaginateResponseDto;
import com.hotel_manage_system.hotel_management_service_api.service.HotelService;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {
    @Override
    public void create(RequestHotelDto dto) {

    }

    @Override
    public void update(RequestHotelDto dto, String hotelId) {

    }

    @Override
    public void delete(String hotelId) {

    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }
}
