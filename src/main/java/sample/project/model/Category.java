package sample.project.model;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    @Id
    @Column( name = "id", length = 25, nullable = false )
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    private Long id;

    @Column( name = "name", length = 25, nullable = true )
    private String name;
}
