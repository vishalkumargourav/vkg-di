package vkg.springframework.vkgdi.controllers;

import org.springframework.stereotype.Controller;
import vkg.springframework.vkgcs.CatPetService;
import vkg.springframework.vkgcs.DogPetService;

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
