package vkg.springframework.vkgdi.config;

import org.springframework.context.annotation.*;
import vkg.springframework.pets.DogPetService;
import vkg.springframework.pets.PetService;
import vkg.springframework.pets.PetServiceFactory;
import vkg.springframework.vkgdi.repositories.EnglishGreetingRepository;
import vkg.springframework.vkgdi.repositories.EnglishGreetingRepositoryImpl;
import vkg.springframework.vkgdi.services.ConstructorInjectedGreetingService;
import vkg.springframework.vkgdi.services.PropertyInjectedGreetingService;
import vkg.springframework.vkgdi.services.SetterInjectedGreetingService;

@ImportResource("classpath:vkgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    // @Bean
    // The bean for this is defined in XML Config file : vkgdi-config.xml
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

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Primary
    @Bean
    @Profile({"dog", "default"})
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }
}
