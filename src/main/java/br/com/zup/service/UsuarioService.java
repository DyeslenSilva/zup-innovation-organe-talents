package br.com.zup.service;

import java.util.List;

import br.com.zup.model.Usuario;
import br.com.zup.repo.UsuarioRepo;

public class UsuarioService {

	
	private UsuarioRepo usuarioRepo;
	
	public void salvarUsuario(Usuario usuario) {
		usuarioRepo.save(usuario);
		
	}

	public List<Usuario> getUsuarios() {
		return usuarioRepo.findAll();
	}

	public Usuario getUsuario(String cpf) {
		return usuarioRepo.getById(cpf);
		
	}

}
