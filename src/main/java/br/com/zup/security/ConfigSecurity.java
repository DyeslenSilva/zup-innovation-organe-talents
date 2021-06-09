package br.com.zup.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.zup.model.UsuarioSistema;

@EnableWebSecurity
public class ConfigSecurity extends WebSecurityConfigurerAdapter {
	
	
	private DataSource dataSource;
	private UsuarioSistema usuarioSistema;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.passwordEncoder(new BCryptPasswordEncoder())
			.usersByUsernameQuery(usuarioSistema.getUsuarioPorlogin())
			.authoritiesByUsernameQuery(usuarioSistema.getPermissaoUsuario())
			.groupAuthoritiesByUsername(usuarioSistema.getPermissaoGrupo())
			.rolePrefix(usuarioSistema.getPrefixo());
	}
	
	
}
