package br.com.zup.security.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.zup.model.Usuario;
import br.com.zup.security.model.Grupo;
import br.com.zup.security.model.Permissao;
//import br.com.zup.security.mSodel.Permissao;
import br.com.zup.security.model.UsuarioSistema;
import br.com.zup.security.repo.GrupoRepository;
import br.com.zup.security.repo.PermissaoRepository;
import br.com.zup.security.repo.UsuarioSistemaRepo;

public class SpringConfigService implements UserDetailsService{

	
	@Autowired
	private UsuarioSistemaRepo usuarioSistemaRepo;
	
	@Autowired
	private GrupoRepository grupoRepo;
	
	@Autowired
	private PermissaoRepository permissaoRepo;
	
	
	private Usuario usuario;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		UsuarioSistema usuarioSistema = usuarioSistemaRepo.findByLogin(login);
		if(usuarioSistema==null) {
			throw new UsernameNotFoundException("Usuario não encontrado");
		}
		
		return (UserDetails) new UsuarioSistema(usuario.getNome(), usuarioSistema.getUsuario(), usuarioSistema.getSenha() ,authorities(usuarioSistema));
	}
	
	public java.util.Collection<? extends GrantedAuthority> authorities(UsuarioSistema usuarioSistema){
		return authorities((UsuarioSistema) grupoRepo.findByUsuariosIn(usuarioSistema));
	}
	
	public java.util.Collection<? extends GrantedAuthority> authorities(List<Grupo> grupos){
		java.util.Collection<GrantedAuthority> auths = new ArrayList<>();
 		for(Grupo grupo : grupos) {
			List<Permissao> listaPermissao = permissaoRepo.findByGruposIn(grupo);
			
			for(Permissao permissao : listaPermissao) {
				auths.add(new SimpleGrantedAuthority("ROLE"+ permissao.getNome()));
			}
			
		}
 		
 		return auths;
	}
	
	
	
}
