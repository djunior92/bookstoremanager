package com.djalmajunior.bookstoremanager.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

//Gera Getters e Setters padrões
@Data
//poder de designer patters builders (gera em tempo de compilação um método estático builder disponibilizando métodos fluentes para criar o objeto do tipo Api
@Builder
//cria um construtor com todos os argumentos
@AllArgsConstructor
//cria um construtor padrão
@NoArgsConstructor
public class ApiError {

    private int code;

    private String status;

    //formatação mais amigável para o campo com formato de data
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;

    private String message;

    private List<String> errors;
}
