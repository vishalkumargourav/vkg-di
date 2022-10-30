package vkg.springframework.vkgdi.controllers;

import org.springframework.stereotype.Controller;
import vkg.springframework.pets.CatPetService;
import vkg.springframework.pets.DogPetService;
import vkg.springframework.pets.PetService;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String findBestPet(){
        return petService.getPetService();
    }
}
