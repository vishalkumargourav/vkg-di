package vkg.springframework.vkgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vkg.springframework.vkgdi.services.ConstructorInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService();
    }
}
