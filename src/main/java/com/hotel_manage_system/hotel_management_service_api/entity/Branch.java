package com.hotel_manage_system.hotel_management_service_api.entity;

import com.hotel_manage_system.hotel_management_service_api.enums.BranchType;
import jakarta.persistence.*;

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




}
