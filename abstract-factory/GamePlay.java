import java.util.Scanner;

public class GamePlay {
    public static void main(String args[]){
        String shipType = "", soldierType = "";
        int totalSoldier, count; 
        AlienArmForceFactory alienArmForceFactory = new AlienArmForceFactory();
        HumanArmForceFactory humanArmForceFactory = new HumanArmForceFactory();

        Soldier[] alienSoldiers;
        Soldier[] humanSoldiers;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the alien ship type. (A / B)\nA - for Alien ship \nB - for Big Alien Ship");

        shipType = input.nextLine();

        Ship alienShip = alienArmForceFactory.createShip(shipType);

        System.out.println("Please enter the total alien soldier number");
        
        totalSoldier = Integer.parseInt(input.nextLine());

        alienSoldiers = new Soldier[totalSoldier];

        count = 0;
        while(count!=totalSoldier){
            System.out.println("Please enter the alien soldier type. (C / P)\nC - for Alien Crew \nP - for Alien Pilot");
        
            soldierType = input.nextLine();

            alienSoldiers[count] = alienArmForceFactory.createSoldier(soldierType);
            alienSoldiers[count].action();

            count++;
        }

        alienShip.doChase();

        // Now we create human armed force
        System.out.println("\n\nPlease enter the human ship type. (H / B)\nH - for human ship \nB - for Big human Ship");

        shipType = input.nextLine();

        Ship humanShip = humanArmForceFactory.createShip(shipType);

        System.out.println("Please enter the total human soldier number");
        
        totalSoldier = Integer.parseInt(input.nextLine());

        humanSoldiers = new Soldier[totalSoldier];

        count = 0;
        while(count!=totalSoldier){
            System.out.println("Please enter the human soldier type. (C / P)\nC - for human Crew \nP - for human Pilot");
        
            soldierType = input.nextLine();

            humanSoldiers[count] = humanArmForceFactory.createSoldier(soldierType);
            humanSoldiers[count].action();

            count++;
        }

        System.out.println();

        humanShip.doChase();
    }
}
