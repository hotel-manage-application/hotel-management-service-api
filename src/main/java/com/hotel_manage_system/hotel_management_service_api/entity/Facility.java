package com.hotel_manage_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long facilityId;

    @Column(name = "facility_name",nullable = false,length = 50)
    private String facilityName;


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id" )
    private Room room;
}
