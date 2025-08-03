package com.hotel_manage_system.hotel_management_service_api.advisor;

import com.hotel_manage_system.hotel_management_service_api.exeption.EntryNotFoundExeption;
import com.hotel_manage_system.hotel_management_service_api.util.StandardResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExeptionHandler {
    @ExceptionHandler(EntryNotFoundExeption.class)
    public ResponseEntity<StandardResponseDto>  handleEntryNotFoundExeption(EntryNotFoundExeption ex){
        return new ResponseEntity<StandardResponseDto>(
                new StandardResponseDto(404, ex.getMessage(),ex),
                HttpStatus.NOT_FOUND
        );
    }
}
