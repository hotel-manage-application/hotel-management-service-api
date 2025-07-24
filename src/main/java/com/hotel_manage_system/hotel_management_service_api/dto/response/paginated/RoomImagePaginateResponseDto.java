package com.hotel_manage_system.hotel_management_service_api.dto.response.paginated;

import com.hotel_manage_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomImagePaginateResponseDto {
    private List<ResponseRoomImageDto> dataList;
    private long dataCount;
}
