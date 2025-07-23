package com.hotel_manage_system.hotel_management_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
    private int addressId;

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
}
