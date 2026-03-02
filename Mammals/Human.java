package Mammals;

public class Human extends Mammal {

    public Human(String name) {
        super(name);
    }

    /**
     * Inherited method makeSound
     * implementation in human.
     */
    public void makeSound() {
        System.out.println("Hei!");
    }
}
