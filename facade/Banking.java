public class Banking{
    public static void main(String args[]){
        BankingFacade account = new BankingFacade(12345678, 1234);

        account.depositCash(200);
        account.withdrawCash(500);
        account.withdrawCash(100);
    }
}