package com.hotel_manage_system.hotel_management_service_api.util;

import lombok.*;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StandardResponseDto {

    private int code;
    private String message;
    private  Object data;

}
