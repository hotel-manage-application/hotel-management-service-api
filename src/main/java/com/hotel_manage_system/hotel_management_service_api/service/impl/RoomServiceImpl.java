package com.hotel_manage_system.hotel_management_service_api.service.impl;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.RoomPaginatedResponseDto;
import com.hotel_manage_system.hotel_management_service_api.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Override
    public void create(RequestRoomDto dto) {

    }

    @Override
    public void update(RequestRoomDto dto, String roomId) {

    }

    @Override
    public void delete(String roomId) {

    }

    @Override
    public ResponseRoomDto findById(String roomId) {
        return null;
    }

    @Override
    public RoomPaginatedResponseDto findAll(int page, int size) {
        return null;
    }
}
