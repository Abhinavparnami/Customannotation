package com.cust.Anno.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "Username Should not be Null")
    private String name;
    @Email
    private String email;
    @NotNull
    @Pattern(regexp = "^\\d{10}$")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotNull
    private String nationality;
}
