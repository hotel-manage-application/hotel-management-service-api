package com.hotel_manage_system.hotel_management_service_api.service;

import com.hotel_manage_system.hotel_management_service_api.dto.request.RequestAddressDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseBranchDto;

public interface AddressService {
    public void create(RequestAddressDto dto);
    public void update(RequestAddressDto  dto,String addressId);
    public void delete(String addressId);
    public ResponseAddressDto findById(String addressId);
    public ResponseBranchDto findBranchById(String branchId);  //address eka branch ekath ekka map wela tiyena nisa

}
