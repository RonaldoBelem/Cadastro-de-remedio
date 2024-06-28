package com.cadastro.remedio.remedio.RemedioContrller;

import com.cadastro.remedio.remedio.RemedioAtualizar.RemedioAtualizar;
import com.cadastro.remedio.remedio.RemedioDto.RemedioDto;
import com.cadastro.remedio.remedio.RemedioEntity.RemedioEntity;
import com.cadastro.remedio.remedio.RemedioRepository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping
@CrossOrigin(origins = {"http://cadastro-de-remedio-production.up.railway.app/swagger-ui/index.html", "https://cadastro-de-remedio-production.up.railway.app/swagger-ui/index.html"}) // Permite CORS para http e https

public class RemedioController {

    @Autowired
    private RemedioRepository repository;
@PostMapping("/cadastro")
    public void AddRemedio(@RequestBody RemedioDto remedio){
        var CadastroRemedio = new RemedioEntity(remedio);
        repository.save(CadastroRemedio);
    }


    @GetMapping("/listaremedio")
    public List<RemedioEntity> ListaDeRemedio( ){

        return repository.findAll();
    }

    @GetMapping("/listaremedio/{id}")
    public List<RemedioEntity> Remedio(@PathVariable Long id) {
        var remedio = repository.findById(id);
        if (remedio.isPresent()) {
            return Collections.singletonList(remedio.get());
        } else {
            return Collections.emptyList(); // Retorna uma lista vazia se o remédio não for encontrado
        }
    }

    @DeleteMapping("/delete")
    public void deleteAll(){
        repository.deleteAll();
    }

    @DeleteMapping("/delete/{id}")
    public void DeletePorId(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/atualizar")
    public void AtualizarRemedio( @RequestBody RemedioAtualizar remedio ) {

        if (repository.existsById(remedio.id())) {
            var RemedioAtualizado = new RemedioEntity(remedio);
            repository.save(RemedioAtualizado);

        }
    }


}
