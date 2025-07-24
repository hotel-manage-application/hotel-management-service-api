package com.hotel_manage_system.hotel_management_service_api.service.impl;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.paginated.FacilityPaginateResponseDto;
import com.hotel_manage_system.hotel_management_service_api.service.FacilityService;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Override
    public void create(RequestFacilityDto dto) {

    }

    @Override
    public void update(RequestFacilityDto dto, String facilityId) {

    }

    @Override
    public void delete(String addressId) {

    }

    @Override
    public ResponseFacilityDto findById(String facilityId) {
        return null;
    }

    @Override
    public FacilityPaginateResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
