package com.hotel_manage_system.hotel_management_service_api.service;


import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.RoomImagePaginateResponseDto;

public interface RoomImageService {
    public void create(RequestRoomImageDto dto);
    public void update(RequestRoomImageDto  dto,String imageId);
    public void delete(String imageId);
    public ResponseRoomImageDto findById(String imageId);
    public RoomImagePaginateResponseDto findAll(int page, int size , String roomId);
}
