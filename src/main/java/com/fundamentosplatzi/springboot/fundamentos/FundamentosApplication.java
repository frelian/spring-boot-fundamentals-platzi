package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	// TIP:


	// Begin section > Inject dependency
		// I inject my dependency (the object to inject is the interface)
		private ComponentDependency componentDependency;
		// In previous versions of Spring Boot it was mandatory add: @Autowired

		// I create constructor of the class, as parameters I receive my dependency to be able to inject it
		public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency) {
			this.componentDependency = componentDependency;
		}
	// End section > Inject dependency

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// I show my implementation of "componentDependency" dependency
		componentDependency.greet();
	}
}
