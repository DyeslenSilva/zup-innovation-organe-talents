package br.com.zup.placeholder;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import br.com.zup.model.Usuario;

@FeignClient(value = "jplaceholder"
		,url = "https://fipeapi.com.br"
		,fallback = JSONPlaceholderClientImp.class)
public interface JSONPlaceHolderClient {

	public List<Usuario> getPosts();
	 public Usuario getPostById(Long idUsuario);
}
