public class HumanCrew extends Soldier {
    public HumanCrew(){
        super();
    }

    public void action(){
        System.out.println("ID-"+ this.getSoldierSerialNo() +" human crew is deployed.");
    }
}
