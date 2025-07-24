package com.hotel_manage_system.hotel_management_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseRoomImageDto {
     private long id;
     private String directory;
     private String fileName;
     private String resourceUrl;
     private String hash;
     private String roomId;
}
