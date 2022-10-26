package vkg.springframework.vkgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vkg.springframework.vkgdi.controllers.MyController;

@SpringBootApplication
public class VkgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(VkgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greetings = myController.sayHello();

		System.out.println(greetings);
	}

}
