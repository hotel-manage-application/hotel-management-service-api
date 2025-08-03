package com.hotel_manage_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "hotel")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Hotel {
    @Id
    @Column(name = "hotel_id")
    private String hotelId;

    @Column(name = "hotel_name",nullable = false,length = 50)
    private String hotelName;

    @Column(name = "star_rating",nullable = false)
    private int startRating;

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

    /*ka hotel ekakta branch godak tiyenna puluwn*/
    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<Branch> branches;

}
