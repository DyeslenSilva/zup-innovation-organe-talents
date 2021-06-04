package br.com.zup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, String> {

}
