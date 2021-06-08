package br.com.zup.config;

import feign.Response;
import feign.codec.ErrorDecoder;
import javassist.NotFoundException;

public class Error implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		
		 switch (response.status()){
         case 400:
             return new Exception();
         case 404:
             return new NotFoundException(methodKey);
         default:
             return new Exception("Generic error");
     }
		
	}

}
