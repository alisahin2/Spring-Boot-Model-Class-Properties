package sample.project.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;
    private int productionYear;
    private int kmh;

    @OneToOne(mappedBy = "vehicle") //mappedBy kullanilirken iliski icinde olunan tablodaki degisken ismi belirtilir. Ayrica tanimlanan classtaki degisken db de tutulmaz. Sadece iliskide olunan tabloda foreign key olarak gosterilir
    private Person owner;

}
