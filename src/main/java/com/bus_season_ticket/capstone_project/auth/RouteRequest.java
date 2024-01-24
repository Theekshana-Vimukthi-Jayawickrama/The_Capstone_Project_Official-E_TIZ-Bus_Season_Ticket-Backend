package com.bus_season_ticket.capstone_project.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RouteRequest {
    private String route;
    private Double charge;
    private String nearestDeport;
}
