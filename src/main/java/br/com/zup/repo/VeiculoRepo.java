package br.com.zup.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.model.Veiculo;

@FeignClient(name= "veiculo" )
public interface VeiculoRepo extends JpaRepository<Veiculo, Integer> {

}
