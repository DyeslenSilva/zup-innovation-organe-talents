package br.com.zup.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zup.model.Usuario;
import br.com.zup.repo.UsuarioRepo;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepo usuarioRepo;
	
	public void salvarUsuario (Usuario usuario) {
		usuarioRepo.save(usuario);
	}
	
	public List<Usuario> getUsuarios(){
		return usuarioRepo.findAll()
				.stream()
				.filter(usuario -> !usuario.isDesativado())
				.collect(Collectors.toList());
	}
	
	public Optional<Usuario> getUsuario(String cpf) {
		return usuarioRepo.findById(cpf);
	}
}
