public abstract class Ship{
    private String name;
    private double speed;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSpeed(){
        return this.speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public abstract void doChase();
}