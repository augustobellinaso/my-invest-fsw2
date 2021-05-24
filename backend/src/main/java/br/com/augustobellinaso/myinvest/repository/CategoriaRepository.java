package br.com.augustobellinaso.myinvest.repository;

import br.com.augustobellinaso.myinvest.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
