package com.hotel_manage_system.hotel_management_service_api.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntryNotFoundExeption extends RuntimeException {
    public EntryNotFoundExeption(String message) {
        super(message);
    }
}
