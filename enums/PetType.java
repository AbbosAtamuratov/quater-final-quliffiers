package enums;

public enum PetType {
    Dog,
    Cat,
    Hamster;

    public static PetType getType(int typeId) {
        return switch (typeId) {
            case 1 -> PetType.Dog;
            case 2 -> PetType.Cat;
            case 3 -> PetType.Hamster;
            default -> null;
        };
    }
}