package com.hotel_manage_system.hotel_management_service_api.entity;

import com.hotel_manage_system.hotel_management_service_api.enums.BranchType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "branch")
public class Branch {
    @Id
    @Column(name = "branch_id")
    private int branchId;

    @Column(name = "room_count",nullable = false,length = 50)
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "hotel_type",nullable = false)
    private BranchType branchType;

    @Column(name = "room_name",nullable = false,length = 50)
    private String branchName;


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_id" ) //hotel table eke tiena eke id ekak branch  kiyana  table ekat enwa
    private Hotel hotel;


    @OneToOne(mappedBy = "branch",cascade = CascadeType.ALL)
    private Address address;

    //eka banch ekkt room godak tiyenna plwn
    @OneToMany(mappedBy = "branch",cascade = CascadeType.ALL)
    private List<Room> rooms;


}
