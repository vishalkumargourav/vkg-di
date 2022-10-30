package vkg.springframework.vkgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vkg.springframework.vkgdi.repositories.EnglishGreetingRepository;
import vkg.springframework.vkgdi.repositories.EnglishGreetingRepositoryImpl;
import vkg.springframework.vkgdi.services.ConstructorInjectedGreetingService;
import vkg.springframework.vkgdi.services.PropertyInjectedGreetingService;
import vkg.springframework.vkgdi.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }
}
