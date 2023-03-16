public class BankingFacade {
    private int accountNumber;
    private int securityPin;

    private WelcomePrompter welcomePrompter;
    private AccountNumberChecker accountNumberChecker;
    private SecurityPinChecker securityPinChecker;
    private BalanceChecker balanceChecker; 

    public BankingFacade(int accountNo, int securityPinNo){
        accountNumber = accountNo;
        securityPin = securityPinNo;

        welcomePrompter = new WelcomePrompter();
        accountNumberChecker = new AccountNumberChecker();
        securityPinChecker = new SecurityPinChecker();
        balanceChecker = new BalanceChecker(); 

        System.out.println(welcomePrompter.getWelcomeMessage());        
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void withdrawCash(double amount){
        if(accountNumberChecker.checkAccountNumber(accountNumber) && securityPinChecker.checkSecurityPin(securityPin))
        {
            if(balanceChecker.hasEnoughBalance(amount)){
                balanceChecker.withdrawMoney(amount);
    
                System.out.println("Transaction successful");
            }
            else{
                System.out.println("Transaction failed");
            }
        }
    }

    public void depositCash(double amount){
        balanceChecker.depositMoney(amount);

        System.out.println("Transaction successful");
    }

    
}
