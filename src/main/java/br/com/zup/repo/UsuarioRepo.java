package br.com.zup.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.model.Usuario;

@FeignClient("usuarios")
public interface UsuarioRepo extends JpaRepository<Usuario, String> {

}
