package model;

import annotations.ValidLoginForm;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Data
@ValidLoginForm
public class LoginForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotEmpty(message = "FirstName is required")
    private String firstName;
//    @NotEmpty(message = "lastName is required")
    private String lastName;
//    @NotEmpty(message = "Email is required")
//    @Email(message = "Email should be a valid email address")
    private String email;
//    @NotEmpty(message = "Password is required")
//    @Size(min = 8, max = 255, message = "Password must be between 5 and 255 characters")
    private String password;
//    @NotEmpty(message = "Username is required")
    private String confirmPassword;

    // getters and setters
}
