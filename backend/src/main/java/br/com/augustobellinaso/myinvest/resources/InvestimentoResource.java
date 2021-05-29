package br.com.augustobellinaso.myinvest.resources;

import br.com.augustobellinaso.myinvest.domain.Investimento;
import br.com.augustobellinaso.myinvest.repository.InvestimentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investimentos")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class InvestimentoResource {

    private InvestimentoRepository investimentoRepository;

    @GetMapping
    public List<Investimento> listarTodos() {
        return investimentoRepository.findAll();
    }

    @GetMapping("/{codigo}")
    public Investimento buscarPeloCodigo(@PathVariable Long codigo) {
        return investimentoRepository.findById(codigo).orElse(null);
    }

    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable Long codigo) {
        investimentoRepository.deleteById(codigo);
    }

    @PostMapping
    public Investimento cadastrar(@RequestBody Investimento investimento){
        return investimentoRepository.save(investimento);
    }
}
