public class SecurityPinChecker {
    private int securityPin = 1234;

    public int getSecurityPin(){
        return securityPin;
    }

    public boolean checkSecurityPin(int securityPinNo){
        if(securityPinNo != getSecurityPin()){
            System.out.println("Your security pin is incorrect");

            return false;
        }
        
        return true;
    }
    
}
