import model.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Error Here---> we cannot instantiate an abstract class!
        // Fiat newFiat = new Fiat();

        Panda myPanda = new Panda();
        myPanda.move();
        myPanda.stop();
        // Class Panda doesn't have theese methods but can use them because
        // inherited from Fiat class!

        System.out.println(myPanda.getNation());

        myPanda.openDoor();

        System.out.println(myPanda.printPandaInfo());

    }

}
