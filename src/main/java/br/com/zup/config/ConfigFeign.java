package br.com.zup.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;

import ch.qos.logback.classic.Logger;
import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.form.ContentType;
//import jdk.javadoc.internal.doclets.toolkit.Content;
import okhttp3.OkHttpClient;

@FeignClient(value = "jplaceholder",
		url="https://fipeapi.com.br",
		configuration = ConfigFeign.class)
@Configuration
public class ConfigFeign {

	@Bean
	public OkHttpClient getClient() {
		return new OkHttpClient();
	}
	
	@Bean
	public RequestInterceptor requestInterceptor(String usuario,String senha) {
		return requestTemplate ->{
			requestTemplate.header("usuario", usuario);
			requestTemplate.header("senha", senha);
			//requestTemplate.header("Aceito", ContentType.APPLICATION_JSON.getMimeType())}
	};
	}
	
	public BasicAuthRequestInterceptor getAuthRequestInterceptor(String usuario, String senha) {
		return new BasicAuthRequestInterceptor(usuario, senha);
	}
	
	public ErrorDecoder errorDecoder() {
		return new Error();
	}
}
