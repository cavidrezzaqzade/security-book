package az.iktex.ch61.model;

import az.iktex.ch61.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@Getter
@Setter
public class AuthorityDTO {

    private Integer id;
    private String name;
 //   private User user;
}
