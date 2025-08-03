package com.hotel_manage_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "room_image")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class RoomImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private FileFormatter fileFormatter;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id" )
    private Room room;
}
