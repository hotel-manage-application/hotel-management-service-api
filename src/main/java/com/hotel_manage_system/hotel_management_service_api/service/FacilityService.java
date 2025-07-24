package com.hotel_manage_system.hotel_management_service_api.service;


import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.FacilityPaginateResponseDto;

public interface FacilityService {
    public void create(RequestFacilityDto dto);
    public void update(RequestFacilityDto  dto,String facilityId);
    public void delete(String addressId);
    public ResponseFacilityDto findById(String facilityId);
    public FacilityPaginateResponseDto findAll(int page,int size , String roomId);
}
