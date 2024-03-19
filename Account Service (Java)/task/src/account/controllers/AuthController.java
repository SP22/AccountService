package account.controllers;

import account.entities.User;
import account.entities.UserDto;
import account.exceptions.AuthException;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@Validated
public class AuthController {
    @PostMapping("/signup")
    public UserDto signup(@RequestBody @Valid User user) {
        if (!user.getEmail().endsWith("@acme.com")) {
            throw new AuthException("Wrong email format");
        }
        return UserDto.convertUserToDTO(user);
    }
}
