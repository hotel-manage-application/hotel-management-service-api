package com.hotel_manage_system.hotel_management_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "address")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Address {
    @Id
    @Column(name = "address_id")
    private String addressId;

    @Column(name = "address_line",nullable = false,length = 50)
    private String addressLine;

    @Column(name = "city",nullable = false,length = 50)
    private String city;

    @Column(name = "country",nullable = false,length = 50)
    private String country;

    @Column(name = "longitude",nullable = false,length = 50)
    private BigDecimal longitude;

    @Column(name = "latitude",nullable = false,length = 50)
    private BigDecimal latitude;

    @OneToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
    //patial eka branch ek  total eka address eka  patial eke pk eka total pattat send karanwa
}
