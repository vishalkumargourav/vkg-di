package vkg.springframework.vkgcs;

import org.springframework.stereotype.Service;

@Service
public class CatPetService implements PetService {
    @Override
    public String getPetService() {
        return "This is Cat Pet Service";
    }
}
