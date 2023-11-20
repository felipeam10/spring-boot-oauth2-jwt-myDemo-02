package com.felipe.myDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

/*
Validação interna que faz o spring security
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ENCODE = " + passwordEncoder.encode("123456"));

		boolean result = passwordEncoder.matches("123456", "$2a$10$MFoRQ5drewjKTRAEflSxuOgd/95djUtwCPJGsH6pWpfr6NeAxwZ/6");
		System.out.println("RESULTADO = " + result);
	}
}
*/

