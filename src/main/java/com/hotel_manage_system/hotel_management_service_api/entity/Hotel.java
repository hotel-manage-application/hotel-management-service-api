package com.hotel_manage_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Table(name = "hotel")

public class Hotel {
    @Id
    @Column(name = "hotel_id")
    private int hotelId;

    @Column(name = "hotel_name",nullable = false,length = 50)
    private String hotelName;

    @Column(name = "star_rating",nullable = false)
    private String startRating;

    @Column(nullable = false)
    @Lob
    private Blob description;

    @Column(name = "created_at",nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at",nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "active_status")
    private boolean activeStatus;

    @Column(name = "starting_from")
    private BigDecimal startingfom;

}
