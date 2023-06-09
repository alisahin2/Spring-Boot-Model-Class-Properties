package sample.project.model;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass // bu annotation olmazsa bu class i extend eden classlar bu class in field larini kullanamaz.
public class BaseEntity {

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE) // sadece yil ay gun tutar
    private Date createdDate = new Date();

    @Column(name = "modified_date")
    @Temporal(TemporalType.TIME) // sadece saat ve dakika bilgisi tutar
    // @Temporal(TemporalType.TIMESTAMP) // yil ay gun ve saat dakika bilgisi tutmayi saglar
    private Date modifiedTime = new Date();

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Enumerated(EnumType.ORDINAL) // EnumType.ORDINAL seklinde kullanirsak veritabanina 0, 1, 2,... seklinde kaydeder
    private Day firstday = Day.SUNDAY;

    @Enumerated(EnumType.STRING) // EnumType.STRING sekilde kullanirsak verileri String formatinda oldugu gibi kaydeder.(SUNDAY, MONDAY, TUESDAY,...)
    private Day happyday = Day.FRIDAY;

}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}