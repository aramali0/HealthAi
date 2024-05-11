package fsts.ma.HealthAi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import fsts.ma.HealthAi.enums.Sex;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
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
    private Sex sex;

    @OneToMany
    private List<Consultation> consultationList ;
    @OneToMany
    private List<Analyse> analyses;
}
