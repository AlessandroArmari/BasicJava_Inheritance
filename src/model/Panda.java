package model;

public class Panda extends Fiat {

    private String model = "Panda";
    private int tyresNum = 4;

    // methods inherited from parent class Fiat
    @Override
    public void move() {
        System.out.println("Panda Moves!");
    }

    @Override
    public void stop() {
        System.out.println("Panda Stops!");
    }

    // this method inherited from Fiat return a property (protected) defined in
    // Fiat, not here in Panda
    @Override
    public String getNation() {
        return nation;
    }

    @Override
    public void openDoor() {
        super.openDoor();
    }

    public String printPandaInfo() {

        // Using String Interpolation in Java

        return String.format("%s is %s vehicle. It is produced in %s and has %s tyres.", model, brand, nation,
                tyresNum);

        
    }

}
