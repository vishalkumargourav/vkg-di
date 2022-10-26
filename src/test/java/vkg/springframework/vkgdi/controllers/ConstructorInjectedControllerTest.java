package vkg.springframework.vkgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vkg.springframework.vkgdi.services.ConstructorInjectedGreetingService;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}