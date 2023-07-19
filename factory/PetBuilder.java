package factory;

import enums.PetType;
import model.*;

public class PetBuilder extends Builder {
    @Override
    protected Pet createNewPet(PetType type) {

        return switch (type) {
            case Cat -> new Cat();
            case Dog -> new Dog();
            case Hamster -> new Hamster();
        };
    }
}
