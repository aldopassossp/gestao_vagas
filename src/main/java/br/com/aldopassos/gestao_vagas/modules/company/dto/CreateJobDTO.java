package br.com.aldopassos.gestao_vagas.modules.company.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateJobDTO {
    
    @Schema(example = "Vaga para pessoa desenvolvedora júnior", requiredMode = RequiredMode.REQUIRED)
    private String description;
    @Schema(example = "Gympass, Plano de Saúde", requiredMode = RequiredMode.REQUIRED)
    private String benefits;
    @Schema(example = "JUNIOR", requiredMode = RequiredMode.REQUIRED)
    private String level;
}
