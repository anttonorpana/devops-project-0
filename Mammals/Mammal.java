package Mammals;

public abstract class Mammal {

    /**
     * The name of the mammal.
     */
    private String name;

    public Mammal(final String name) {
        setName(name);
    }

    public void setName(final String name) {
        this.name = name;
    }
}
