package Autocomplete.autocomplete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AutocompleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutocompleteApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate (){
		return new RestTemplate();
	}

}
