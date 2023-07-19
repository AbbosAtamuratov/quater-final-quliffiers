import controller.PetController;
import model.Pet;
import repo.*;
import ui.ConsoleMenu;

public class PetRegister {
    public static void main(String[] args) {
        IRepo<Pet> pet_system = new PetRepo();
        PetController controller = new PetController(pet_system);
        new ConsoleMenu(controller).start();
    }
}