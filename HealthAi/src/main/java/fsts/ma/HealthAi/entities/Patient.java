package fsts.ma.HealthAi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import fsts.ma.HealthAi.enums.Sexe;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private int age;
    private String tel;
    private Sexe sexe;

    @OneToMany
    private List<Consultation> consultationList ;
    @OneToMany
    private List<Analyse> analyses;
}
