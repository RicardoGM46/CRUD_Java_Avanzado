package co.com.bancolombia.usecase.animales;

import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AnimalesUseCase {

    private AnimalesRepository animalesRepository;

    public void create(Animales animales){
       animalesRepository.create(animales);
    }

    public Animales read(String id){
        return animalesRepository.read(id);
    }

    public Animales update(String id, Animales animales) throws Exception{
       animalesRepository.update(id,animales);
       return animales;
    }

    public void delete(String id){
        animalesRepository.delete(id);
    }

    public List<Animales> getAll() {
        return animalesRepository.getAll();
    }
}
