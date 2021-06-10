package br.com.zup.security.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.model.Usuario;
import br.com.zup.security.model.Grupo;
import br.com.zup.security.model.Permissao;
import br.com.zup.security.model.UsuarioSistema;


public interface PermissaoRepository extends JpaRepository<Permissao, String> {

	List<Permissao> findByGruposIn(Grupo grupo);
}
