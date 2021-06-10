package br.com.zup.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.security.model.UsuarioSistema;

public interface UsuarioSistemaRepo extends JpaRepository<UsuarioSistema, String> {

	public UsuarioSistema findByLogin(String username);

	//public UsuarioSistema findByLogin(String username);
	
}
