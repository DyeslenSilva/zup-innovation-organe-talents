package br.com.zup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrangeTalentsZupInnovationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeTalentsZupInnovationApplication.class, args);
	}

}
