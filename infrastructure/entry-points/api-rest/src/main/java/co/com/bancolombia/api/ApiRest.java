package co.com.bancolombia.api;

import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.usecase.animales.AnimalesUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import lombok.Generated;

@RestController
@ResponseBody
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)


public class ApiRest {
//    private final MyUseCase useCase;
    private final AnimalesUseCase animalesUseCase;

    @GetMapping(path = "/animal/{id}")
    public Animales read(@PathVariable String id){
        return this.animalesUseCase.read(id);
    }
    @PostMapping(path= {"/animales"})
    public void create(@RequestBody Animales animales){
        this.animalesUseCase.create(animales);
    }

    @PutMapping(path = {"/animales/{id}"})
    public void update(@PathVariable String id, @RequestBody Animales animales){
        try{
            this.animalesUseCase.update(id, animales);
        }catch (Exception var4){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, var4.getMessage());
        }
    }

    @DeleteMapping(path = {"/animales/{id}"})
    public void delete(@PathVariable String id){
        this.animalesUseCase.delete(id);
    }

    @GetMapping(
            path = {"/animales"}
    )
    public List<Animales> getAll() {
        return this.animalesUseCase.getAll();
    }

    @Generated
    public ApiRest(AnimalesUseCase animalesUseCase) {
        this.animalesUseCase = animalesUseCase;
    }
}
