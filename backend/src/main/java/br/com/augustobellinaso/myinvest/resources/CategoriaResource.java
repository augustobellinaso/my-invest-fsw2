package br.com.augustobellinaso.myinvest.resources;

import br.com.augustobellinaso.myinvest.domain.Categoria;
import br.com.augustobellinaso.myinvest.repository.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/categorias")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoriaResource {

    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    @GetMapping("/{codigo}")
    public Categoria buscarPeloCodigo(@PathVariable Long codigo){
        return categoriaRepository.findById(codigo).orElse(null);
    }

    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable Long codigo) {
        categoriaRepository.deleteById(codigo);
    }

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
