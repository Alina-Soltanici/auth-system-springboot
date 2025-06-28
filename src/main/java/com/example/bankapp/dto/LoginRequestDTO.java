package com.example.bankapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequestDTO {
        @NotBlank(message = "Username is mandatory")
        private String username;

        @Size(min = 6, message = "Password must be at least 6 characters")
        private String password;
}
