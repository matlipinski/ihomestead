package pl.homestead.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class IHomesteadApplication {

	public static void main(String[] args) {
		log.info("Starting application");
		SpringApplication.run(IHomesteadApplication.class, args);
	}
}
