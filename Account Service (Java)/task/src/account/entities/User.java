package account.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotBlank
    private String name;

    @NotBlank
    private String lastname;

    @NotBlank
    private String email;

    @Setter
    @NotBlank
    private String password;

}
