import java.util.Scanner;

public class GamePlay {
    public static void main(String args[]){
        String shipType = ""; 
        ShipFactory shipFactory = new ShipFactory();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the ship type. (A / B / H)");

        if(input.hasNextLine()){
            shipType = input.nextLine();
        }

        Ship ship = shipFactory.createShip(shipType);

        ship.doChase();
    }
}
