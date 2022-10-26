package vkg.springframework.vkgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vkg.springframework.vkgdi.controllers.ConstructorInjectedController;
import vkg.springframework.vkgdi.controllers.MyController;
import vkg.springframework.vkgdi.controllers.PropertyInjectedController;
import vkg.springframework.vkgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class VkgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(VkgDiApplication.class, args);

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
	}

}
