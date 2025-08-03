package com.hotel_manage_system.hotel_management_service_api.repo;

import com.hotel_manage_system.hotel_management_service_api.entity.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface HotelRepo extends JpaRepository<Hotel,String> {

    @Query(value = "SELECT * FROM hotel where hotel_name like %?1% and active_status = true",nativeQuery = true)
    public Page<Hotel>searchAllHotels(String searchText, Pageable pageable);

    @Query(value = "SELECT count(*) FROM hotel where hotel_name like %?1% and active_status = true",nativeQuery = true)
    public long countAllHotels(String searchText);
}
