package co.com.bancolombia.model.animales;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Animales {
    private String id;
    private int numberoflegs;
    private char gender;
    private String species;
    private String habitat;
    private boolean domestic;

    public boolean getDomestic() {
        return domestic;
    }
}
