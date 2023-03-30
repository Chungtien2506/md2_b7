package LopAnimalvainterfaceEdible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "chicken:o o o o o";
    }

    @Override
    public String howToEat() {
        return "an duoc";
    }
}
