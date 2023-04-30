import java.util.Scanner;

public class GamePlay {
    public static void main(String args[]){
        String shipType = ""; 
        AlienShipFactory shipFactory = new AlienShipFactory();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the ship type. (A / B / C)\nA - for Alien ship \nB - for Big Human Ship\nH - Human Ship");

        if(input.hasNextLine()){
            shipType = input.nextLine();
        }

        Ship ship = shipFactory.createShip(shipType);

        ship.doChase();
    }
}
