package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	// Begin section > Inject dependency
		// I inject my dependency (the object to inject is the interface)
		private ComponentDependency componentDependency;
		// Note:  In previous versions of Spring Boot it was mandatory add: @Autowired

		// New dependency 1) add my new interface (My dependency)
		private MyBean myBean;

		// I create constructor of the class, as parameters I receive my dependency to be able to inject it
		// 2) add my new interface in constructor.
		public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean) {
			this.componentDependency = componentDependency;
			this.myBean = myBean; // Call myBean property = myBean param
		}

	// End section > Inject dependency

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		// I show my implementation of "componentDependency" dependency
		componentDependency.greet();

		// 3) Call my dependency and the implement is the print method
		myBean.print();
	}
}
