public class AccountNumberChecker {
    private int accountNumber = 12345678;

    public int getAccountNumber(){
        return accountNumber;
    }

    public boolean checkAccountNumber(int accountNo){
        if(accountNumber != getAccountNumber()){
            System.out.println("Your account number is incorrect");

            return false;
        }
        
        return true;
    }
    
}
