package com.hotel_manage_system.hotel_management_service_api.service;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.HotelPaginateResponseDto;

import java.sql.SQLException;

public interface HotelService {
    public void create(RequestHotelDto  dto) throws SQLException;
    public void update(RequestHotelDto  dto,String hotelId) throws SQLException;
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId) throws SQLException;
    public HotelPaginateResponseDto findAll(int page,int size , String searchText);
}
