package vkg.springframework.vkgdi.controllers;

import org.springframework.stereotype.Controller;
import vkg.springframework.pets.CatPetService;
import vkg.springframework.pets.DogPetService;

@Controller
public class PetController {
    private final CatPetService catPetService;
    private final DogPetService dogPetService;

    public PetController(CatPetService catPetService, DogPetService dogPetService) {
        this.catPetService = catPetService;
        this.dogPetService = dogPetService;
    }

    public String findBestPet(){
        return catPetService.getPetService();
    }
}
