package com.example.demo_park_api.web.controller.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioResponseDto {
    private Long id;
    private String username;
    private String role;
}
