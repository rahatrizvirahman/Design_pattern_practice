public class ShipFactory {
    public Ship createShip(String type){
        Ship ship;

        if(type.toUpperCase().equals("A")){
            return new AlienShip();
        } 
        else if(type.toUpperCase().equals("B")){
            return new BigHumanShip();
        } 
        
        return new HumanShip();
        
    }
}
