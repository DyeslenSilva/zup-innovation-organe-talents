package br.com.zup.placeholder;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.mapping.Collection;

import br.com.zup.model.Usuario;

public class JSONPlaceholderClientImp implements JSONPlaceHolderClient{

	@Override
	public List<Usuario> getPosts() {
		return Collections.emptyList();
	}

	@Override
	public Usuario getPostById(Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
