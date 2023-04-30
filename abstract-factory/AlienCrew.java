public class AlienCrew extends Soldier {
    public AlienCrew(){
        super();
    }

    public void action(){
        System.out.println("ID-"+ this.getSoldierSerialNo() +" alien crew is deployed.");
    }
}
