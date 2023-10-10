package co.com.bancolombia.jpa.entities;


import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "animales")

public class AnimalesEntity {

    @Id
    private String id;
    @Column
    private int numberoflegs;
    @Column
    private char gender;
    @Column
    private String species;
    @Column
    private String habitat;
    @Column
    private boolean domestic;
}
