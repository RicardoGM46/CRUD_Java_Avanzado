package co.com.bancolombia.model.animales.gateways;


import co.com.bancolombia.model.animales.Animales;
import java.util.List;

public interface AnimalesRepository {


    void create(Animales animales);

    Animales read(String id);

    default Animales update(String id, Animales animales) throws Exception{
        return animales;
    }

    void delete(String id);

    List<Animales> getAll();
}
