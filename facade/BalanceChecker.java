public class BalanceChecker {
    private double balance = 200;

    public double getAccountBalance(){
        return balance;
    }

    public boolean hasEnoughBalance(double amount){
        if(amount<=getAccountBalance()){
            
            return true;
        }
        
        System.out.println("Sorry! You don't have enough balance");
        
        return false;
    }

    public void withdrawMoney(double amount){
        if(hasEnoughBalance(amount)){
            balance -= amount;

            System.out.println("$"+amount+" was successfully withdrawn.");
        }
    }

    public void depositMoney(double amount ){
        balance += amount;

        System.out.println("$"+amount+" was successfully deposited.");
    }

    
}
