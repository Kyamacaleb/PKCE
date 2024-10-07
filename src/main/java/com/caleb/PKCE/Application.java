package com.caleb.PKCE;

import com.caleb.PKCE.service.PkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

// New component to execute code after application startup
@Component
class AppStartupRunner implements CommandLineRunner {

	private final PkService pkService;

	@Autowired
	public AppStartupRunner(PkService pkService) {
		this.pkService = pkService;
	}

	@Override
	public void run(String... args) {
		pkService.printCodeVerifierAndChallenge();
	}
}
