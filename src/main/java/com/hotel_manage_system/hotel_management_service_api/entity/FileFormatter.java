package com.hotel_manage_system.hotel_management_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Lob;



@Embeddable  // me file resoures thawath tnaka use karanna oni unama
public class FileFormatter {
    @Lob
    @Column(name = "file_name")
    private  byte[] fileName;

    @Column(name = "resouce_url")
    private  byte[] resourceUrl;

    @Column(name = "directoy")
    private  byte[] directory;

    @Column(name = "hash")
    private  byte[] hash;


}
