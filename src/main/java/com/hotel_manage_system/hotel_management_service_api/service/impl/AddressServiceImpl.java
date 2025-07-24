package com.hotel_manage_system.hotel_management_service_api.service.impl;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseBranchDto;
import com.hotel_manage_system.hotel_management_service_api.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public void create(RequestAddressDto dto) {

    }

    @Override
    public void update(RequestAddressDto dto, String addressId) {

    }

    @Override
    public void delete(String addressId) {

    }

    @Override
    public ResponseAddressDto findById(String addressId) {
        return null;
    }

    @Override
    public ResponseBranchDto findBranchById(String branchId) {
        return null;
    }
}
