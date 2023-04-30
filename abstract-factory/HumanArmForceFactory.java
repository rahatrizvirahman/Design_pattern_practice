public class HumanArmForceFactory implements ArmForceFactory {
    public Ship createShip(String type){
        if(type.toUpperCase().equals("H")){
            return new HumanShip();
        } 
       
        return new BigHumanShip();
    }
    
    public Soldier createSoldier(String type){
        if(type.toUpperCase().equals("C")){
            return new HumanCrew();
        } 
       
        return new HumanPilot();
    }
}
