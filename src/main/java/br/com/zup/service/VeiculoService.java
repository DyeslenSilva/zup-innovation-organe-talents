package br.com.zup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zup.model.Veiculo;
import br.com.zup.repo.VeiculoRepo;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepo veiculoRepo;
	
	public void cadastroVeiculo(Veiculo veiculo) {
		veiculoRepo.save(veiculo);
	}
	
	
}
