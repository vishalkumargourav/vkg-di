package vkg.springframework.vkgdi.services;

public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! -- Setter";
    }
}
