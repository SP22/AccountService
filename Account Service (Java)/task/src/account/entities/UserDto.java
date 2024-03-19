package account.entities;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {
    private String name;

    private String lastname;

    private String email;

    public UserDto(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public static UserDto convertUserToDTO(User user) {
        return new UserDto(user.getName(), user.getLastname(), user.getEmail());
    }
}
