package com.hotel_manage_system.hotel_management_service_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel-management/api/v1/test")
public class TestController {
    @GetMapping("/cheak")
    public String test() {
        return "Connected...";
    }
}
