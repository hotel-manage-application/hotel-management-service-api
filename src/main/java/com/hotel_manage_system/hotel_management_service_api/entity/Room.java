package com.hotel_manage_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "room")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Room {
    @Id
    @Column(name = "room_id",length = 50)
    private String roomId;

    @Column(name = "room_number",length = 50,nullable = false)
    private String roomNumber;

    @Column(name = "room_type",length = 50,nullable = false)
    private String type;

    @Column(name = "bed_count",length = 50,nullable = false)
    private int bedCount;

    @Column(name = "price",length = 50,nullable = false)
    private BigDecimal price;

    @Column(name = "is_available",length = 50,nullable = false)
    private  boolean isAvailable;


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id" )
    private Branch branch;

    //room ekaktfacility godak tiyennwa
    @OneToMany(mappedBy = "room",cascade = CascadeType.ALL)
    private List<Facility> facilities;

    //eka room ekakta image godak tiyennwa
    @OneToMany(mappedBy = "room",cascade = CascadeType.ALL)
    private List<RoomImage> roomImages;

}
