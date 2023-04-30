public class AlienPilot extends Soldier {
    public AlienPilot(){
        super();
    }

    public void action(){
        System.out.println("ID-"+ this.getSoldierSerialNo() +" alien pilot is deployed.");
    }
}
