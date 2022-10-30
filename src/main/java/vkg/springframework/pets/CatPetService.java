package vkg.springframework.pets;

//@Service
public class CatPetService implements PetService {

    @Override
    public String getPetService() {
        return "This is Cat Pet Service";
    }
}
