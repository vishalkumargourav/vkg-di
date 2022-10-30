package vkg.springframework.vkgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import vkg.springframework.vkgdi.controllers.*;

@ComponentScan(basePackages = {"vkg.springframework.vkgdi", "vkg.springframework.pets"})
@SpringBootApplication
public class VkgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(VkgDiApplication.class, args);


		// >>>>>>>> Demonstrating Spring Profile <<<<<<<<
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		// >>>>>>>> Demonstrating Dependency Injection Types <<<<<<<<
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----Primary Bean----");
		System.out.println(myController.sayHello());

		System.out.println("----Property Injected DI----");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----Setter Injected DI----");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----Constructor Injected DI----");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		// >>>>>>>> Demonstrating Component Scan <<<<<<<<
		System.out.println(">>> CS <<< :: Component Scan Example");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.findBestPet());
	}

}
