public class HumanShip extends Ship{
   
    public HumanShip(){
        // super();

        setName("Alien_destroyer_01");
        setSpeed(30);
    }

    

    public void doChase(){
        System.out.println(this.getName() + " is chasing an alien ship at " + this.getSpeed() + " kmph");
    }
    
}
