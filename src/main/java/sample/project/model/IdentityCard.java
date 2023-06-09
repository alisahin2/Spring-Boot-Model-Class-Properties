package sample.project.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class IdentityCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String identityNo;
    private LocalDate dateOfBirth;
    private char gender;
    @OneToOne(mappedBy = "identity")
    private Person person;
}
