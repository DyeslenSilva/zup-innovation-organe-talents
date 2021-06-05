package br.com.zup.service;

import org.springframework.stereotype.Service;

import br.com.zup.model.VeiculoUsuario;
import br.com.zup.repo.UsuarioVeiculoRepo;

@Service
public class UsuarioVeiculoService {

	private VeiculoUsuario veiculoUsuario;
	
	private UsuarioVeiculoRepo usuarioVeiculoRepo;
	
	
	public VeiculoUsuario getVeiculoUsuarioPorCPF(String cpf) {
		usuarioVeiculoRepo.findById(cpf);
		return veiculoUsuario;
	}
	
	
	
}
