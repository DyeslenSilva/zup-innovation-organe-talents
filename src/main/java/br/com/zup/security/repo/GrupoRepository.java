package br.com.zup.security.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.security.model.Grupo;
import br.com.zup.security.model.UsuarioSistema;

public interface GrupoRepository extends JpaRepository<Grupo, Long> {

	List<Grupo> findByUsuariosIn(UsuarioSistema usuario);
	
}
