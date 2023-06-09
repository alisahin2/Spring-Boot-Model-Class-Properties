package sample.project.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {

    @Id
    @Column( name = "id", length = 25, nullable = false )
    @GeneratedValue(generator = "product_generator", strategy = GenerationType.SEQUENCE) // performansi en yuksek artirim stratejisi = GenerationType.SEQUENCE
    @SequenceGenerator(name = "product_generator", sequenceName = "product_sequence", initialValue = 1000000, allocationSize = 1) // ilk id nin degeri 1000000 olacak ve sonrakiler 1 1 artarak ilerlicek. Cunku allocationSize=1 diye belirttik
    private Long id;

    @Column( name = "name", length = 25, nullable = true )
    private String name;

    @Column( name = "stock", length = 25, nullable = false )
    private String stock;

    @Column( name = "price", length = 25, nullable = false, precision = 5, scale = 2) // precision sayinin tam kisminin kac basamakli olacagini, scale ise virgulden sonra kac hane olacagini belirtir
    private BigDecimal price;

    @Lob // description degiskeni String tipinde oldugu icin boyut asimi oldugu zaman CLOB tipinde davranir( CLOB = character large object)
    @Column( name = "description", length = 250, nullable = false )
    private String description;

    @Lob // bu annotation sayesinde image degiskeni BLOB tipinde tutulur.( BLOB = binary large object)
    private byte[] image;

    private byte[] imageContent; // bu degisken veritabaninda Binary olarak tutulur

}
