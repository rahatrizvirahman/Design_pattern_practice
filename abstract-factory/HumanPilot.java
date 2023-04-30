public class HumanPilot extends Soldier {
    public HumanPilot(){
        super();
    }

    public void action(){
        System.out.println("ID-"+ this.getSoldierSerialNo() +" human pilot is deployed.");
    }
}
