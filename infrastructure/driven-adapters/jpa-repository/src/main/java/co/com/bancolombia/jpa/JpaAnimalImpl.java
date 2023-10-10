package co.com.bancolombia.jpa;


import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;



@Component
@AllArgsConstructor
public class JpaAnimalImpl implements AnimalesRepository {

    private JPARepositoryAdapter jpaRepositoryAdapter;

    @Override
    public void create(Animales animales){
        String id = UUID.randomUUID().toString();
        animales.setId(id);
        jpaRepositoryAdapter.save(animales);
    }

    @Override
    public Animales read(String id) {
        return jpaRepositoryAdapter.findById(id);
    }

    @Override
    public Animales update(String id, Animales animales) throws Exception{
        Animales animalesDb = jpaRepositoryAdapter.findById(id);

        if(animalesDb == null) throw new Exception("Animal no encontrado: " + id);

        animalesDb.setNumberoflegs(animales.getNumberoflegs());
        animalesDb.setGender(animales.getGender());
        animalesDb.setSpecies(animales.getSpecies());
        animalesDb.setHabitat(animales.getHabitat());
        animalesDb.setDomestic(animales.getDomestic());

        jpaRepositoryAdapter.save(animalesDb);
        return animalesDb;
    }

    @Override
    public void delete(String id){
        jpaRepositoryAdapter.deleteById(id);
    }

    @Override
    public List<Animales> getAll(){
        return jpaRepositoryAdapter.findAll();
    }
}
