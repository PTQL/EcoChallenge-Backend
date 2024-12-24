package com.ecochallenges.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ChallengeDTO {

    @NotNull(message = "El campo titulo es obligatorio")
    private String title;

    @NotNull(message = "El campo descripción es obligatorio")
    private String description;

    @Min(value = 0, message = "Debe ser mayor a cero")
    private int points;
    private String type;
    private String status;
    private int requiredEvidence;
}
