package com.hotel_manage_system.hotel_management_service_api.service.impl;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.HotelPaginateResponseDto;
import com.hotel_manage_system.hotel_management_service_api.service.BranchService;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void create(RequestBranchDto dto) {

    }

    @Override
    public void update(RequestBranchDto dto, String branchId) {

    }

    @Override
    public void delete(String branchId) {

    }

    @Override
    public ResponseBranchDto findById(String branchId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAllByHotelId(int page, int size, String searchText, String hotelId) {
        return null;
    }
}
