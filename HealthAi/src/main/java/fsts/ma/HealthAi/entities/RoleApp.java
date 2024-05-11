package fsts.ma.HealthAi.entities;

import fsts.ma.HealthAi.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RoleApp {
    @Id
    private Long idRole;

    @Enumerated(EnumType.STRING)
    private Role role;
}

