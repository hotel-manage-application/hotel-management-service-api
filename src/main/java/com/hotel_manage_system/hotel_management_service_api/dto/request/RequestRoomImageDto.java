package com.hotel_manage_system.hotel_management_service_api.dto.request;

import com.hotel_manage_system.hotel_management_service_api.enums.BranchType;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestRoomImageDto {
    private MultipartFile file;  //image eka ewanne file ekk widihta
    private String roomId;
}
