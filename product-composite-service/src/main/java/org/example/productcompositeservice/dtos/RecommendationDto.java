package org.example.productcompositeservice.dtos;

import lombok.Data;

@Data
public class RecommendationDto {
    private Long recommendationDto;
    private Long producId;
    private String author;
    private int rate;
    private String content;
}
