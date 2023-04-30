public abstract class Soldier {
    private static int count =  0;

    private int soldierSerialNo;

    public Soldier(){
        soldierSerialNo = count;
        count++;        
    }

    public int getSoldierSerialNo(){
        return soldierSerialNo;
    }

    abstract public void action();
}
