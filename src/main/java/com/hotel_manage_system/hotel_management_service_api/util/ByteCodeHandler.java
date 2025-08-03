package com.hotel_manage_system.hotel_management_service_api.util;

import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;

@Service
public class ByteCodeHandler {
    //string -> byte  wage convertions karana widiha

    public Blob stringToBlob(String data) throws SQLException {
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        return new SerialBlob(bytes);
    }

    public String blobToString(Blob data) throws SQLException {
        int blobLength = (int) data.length();
        byte[] bytes = data.getBytes(1, blobLength);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
