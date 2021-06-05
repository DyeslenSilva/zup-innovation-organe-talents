package br.com.zup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.model.VeiculoUsuario;

public interface UsuarioVeiculoRepo extends JpaRepository<VeiculoUsuario, String> {

}
