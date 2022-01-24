package az.iktex.ch61.model;

import az.iktex.ch61.entity.enums.EncryptionAlgorithm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

    private Integer id;

    private String username;
    private String password;

    private EncryptionAlgorithm algorithm;

    private List<AuthorityDTO> authorities;

}
