package sample.project.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String email;
    private String phone;
    private LocalDate startDate;
    @OneToOne
    private IdentityCard identity;
    @OneToOne
    private Car vehicle;
}
