package com.cadastro.remedio.remedio.RemedioDto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record RemedioDto(


        String nome,
        String fornecedor,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
        LocalDate validade

) {
}
