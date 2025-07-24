package com.hotel_manage_system.hotel_management_service_api.service;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestBranchDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.HotelPaginateResponseDto;

public interface BranchService {
    public void create(RequestBranchDto dto);
    public void update(RequestBranchDto  dto,String branchId);
    public void delete(String branchId);
    public ResponseBranchDto findById(String branchId);
    public HotelPaginateResponseDto findAll(int page, int size , String searchText);
    public HotelPaginateResponseDto findAllByHotelId(int page, int size , String searchText,String hotelId);
}
