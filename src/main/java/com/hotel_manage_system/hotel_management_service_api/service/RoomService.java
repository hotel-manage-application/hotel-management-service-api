package com.hotel_manage_system.hotel_management_service_api.service;


import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.RoomPaginatedResponseDto;

public interface RoomService {
    public void create(RequestRoomDto dto);
    public void update(RequestRoomDto  dto,String roomId);
    public void delete(String roomId);
    public ResponseRoomDto findById(String roomId);
    public RoomPaginatedResponseDto findAll(int page,int size );
}
