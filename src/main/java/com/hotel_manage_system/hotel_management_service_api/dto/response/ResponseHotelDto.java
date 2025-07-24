package com.hotel_manage_system.hotel_management_service_api.dto.response;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseHotelDto {
    private String hotelId;
    private boolean activeStatus;
    private LocalDateTime  createdAt;
    private LocalDateTime updatedAt;
    private String description;  /*longblob ekak damme character lenght dnne nati nisa   string dannat puluwn*/
    private String hotelName;
    private int starRating;
    private BigDecimal startingFrom;
    private List<ResponseBranchDto> branches;
}

