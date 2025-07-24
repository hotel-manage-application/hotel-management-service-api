package com.hotel_manage_system.hotel_management_service_api.dto.response.paginated;

import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseAddressDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressPaginateResponseDto {
    private List<ResponseAddressDto> dataList;
    private long dataCount;
}
