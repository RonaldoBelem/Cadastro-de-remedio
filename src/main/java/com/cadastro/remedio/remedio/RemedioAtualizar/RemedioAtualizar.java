package com.cadastro.remedio.remedio.RemedioAtualizar;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record RemedioAtualizar(

        Long id,
        String nome,
        String fornecedor,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        LocalDate validade

) {
}
