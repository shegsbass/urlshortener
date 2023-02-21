package dev.shegs.urlshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class  UrlshortenerApplication {

	public static void main(String[] args)   {
		SpringApplication.run(UrlshortenerApplication.class, args);
	}

}
