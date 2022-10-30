package vkg.springframework.pets;

//@Service
public class DogPetService implements PetService {
    @Override
    public String getPetService() {
        return "This is Dog Pet Service";
    }
}
