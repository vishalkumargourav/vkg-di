package vkg.springframework.vkgdi.services;

// *** NOTE *** : This classes is not annotated with @Service, because its configuration is
// defined in GreetingServiceConfig.
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! -- Constructor";
    }
}
