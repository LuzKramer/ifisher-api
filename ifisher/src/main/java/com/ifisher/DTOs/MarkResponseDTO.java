package com.ifisher.DTOs;

import com.ifisher.Models.Mark;

import java.sql.Timestamp;

public record MarkResponseDTO(
        Long id,
        String description,
        String latitude,
        String longitude,
        Integer weight,
        String type,
        Timestamp datetime,
        String user_id,
        Long fish_id
) {
    public MarkResponseDTO(Mark mark) {
        this(
                mark.getId(),
                mark.getDescription(),
                mark.getLatitude(),
                mark.getLongitude(),
                mark.getWeight(),
                mark.getType(),
                mark.getDatetime(),
                mark.getUser_id(),
                mark.getFish_id()
        );
    }
}