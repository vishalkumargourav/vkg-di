package vkg.springframework.pets;

import org.springframework.stereotype.Service;

@Service
public class DogPetService implements PetService {
    @Override
    public String getPetService() {
        return "This is Dog Pet Service";
    }
}
