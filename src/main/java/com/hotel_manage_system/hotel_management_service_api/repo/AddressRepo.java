package com.hotel_manage_system.hotel_management_service_api.repo;

import com.hotel_manage_system.hotel_management_service_api.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, String> {
}
