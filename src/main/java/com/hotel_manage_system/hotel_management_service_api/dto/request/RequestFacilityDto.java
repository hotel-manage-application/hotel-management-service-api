package com.hotel_manage_system.hotel_management_service_api.dto.request;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestFacilityDto {
    private String name;
    private String roomId;
}
