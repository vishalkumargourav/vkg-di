package vkg.springframework.vkgdi.services;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! -- Property";
    }
}
