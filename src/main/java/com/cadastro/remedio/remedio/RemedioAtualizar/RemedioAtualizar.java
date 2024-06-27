package com.cadastro.remedio.remedio.RemedioAtualizar;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record RemedioAtualizar(

        Long id,
        String nome,
        String fornecedor,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
        LocalDate validade

) {
}
