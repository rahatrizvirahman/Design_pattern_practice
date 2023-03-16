public class AlienShip extends Ship{

   
    public AlienShip(){
        // super();

        setName("Human_destroyer_01");
        setSpeed(20);
    }
    

    public void doChase(){
        System.out.println(this.getName() + " is chasing a human ship at " + this.getSpeed() + " kmph");
    }
}
