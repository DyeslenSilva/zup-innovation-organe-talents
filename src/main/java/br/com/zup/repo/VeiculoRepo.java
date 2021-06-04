package br.com.zup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.model.Veiculo;

public interface VeiculoRepo extends JpaRepository<Veiculo, Integer> {

}
