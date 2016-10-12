package com.zagar;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PegasysApiApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(PegasysApiApplication.class, args);

		PegasSpringClient client = app.getBean(PegasSpringClient.class);

		client.packageSearchOptions();
	}
}
