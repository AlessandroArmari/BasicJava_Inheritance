package model;

public abstract class Fiat {

    // set this property as "protected" to make it visibile within children classes!
    protected String brand = "Fiat";
    protected String nation = "Italy";

    // abstract methods don't have bodies!

    abstract void move();

    abstract void stop();

    abstract String getNation();
    // Now Panda MUST inherit theese methods!

    protected void openDoor() {
        System.out.println("Door Open!");
    }
    // I'll use this method in a different way---> go to Panda

}
