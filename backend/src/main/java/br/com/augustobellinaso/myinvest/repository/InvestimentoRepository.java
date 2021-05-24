package br.com.augustobellinaso.myinvest.repository;

import br.com.augustobellinaso.myinvest.domain.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
}
