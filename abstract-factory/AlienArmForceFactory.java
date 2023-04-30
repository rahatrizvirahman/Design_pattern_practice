public class AlienArmForceFactory implements ArmForceFactory{
    public Ship createShip(String type){
        if(type.toUpperCase().equals("A")){
            return new AlienShip();
        } 
        
        return new BigAlienShip();
    }

    public Soldier createSoldier(String type){
        if(type.toUpperCase().equals("C")){
            return new AlienCrew();
        } 
       
        return new AlienPilot();
    }
}
