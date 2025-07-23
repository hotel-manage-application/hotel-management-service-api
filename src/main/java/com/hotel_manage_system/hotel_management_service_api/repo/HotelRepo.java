package com.hotel_manage_system.hotel_management_service_api.repo;

import com.hotel_manage_system.hotel_management_service_api.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepo extends JpaRepository<Hotel,String> {
}
