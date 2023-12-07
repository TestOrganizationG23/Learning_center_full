package uz.pdp.learning_center_full.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import lombok.*;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
import uz.pdp.learning_center_full.entity.enums.UserRole;

import java.util.Collection;
import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity extends BaseEntity  {
   private String name;
   private String surname;
   @Email
   @Column(unique = true)
   private String email;
   private String password;
   private String phoneNumber;
   @Enumerated(EnumType.STRING)
   private UserRole role;

}
