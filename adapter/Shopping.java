public class Shopping{
    // Here the Shop class expects the multiplyAll method in the Calculator class to accept parameters such 
    // that the double values is first and then  the double array is passed. 
    // But the multiplyAll(double[] values, double multiplier) method accepts double array as first parameter
    // and double value as second. So, we use an adapter class CalculationAdapter which adapts the multiplyAll
    // method of the adaptee class, Calculator, so that the client class, Shop, can use it without changing the
    // adaptee class
    
    public static void main(String[] args) {        
        Calculator calculator = new Calculator();
        CalculationAdapter calculationAdapter = new CalculationAdapter(calculator);

        Shop shop = new Shop(calculationAdapter);
        double[] originalPrices = shop.getPrices();

        double[] discountedPrices = shop.getDiscountedPrice();

        for(int i=0; i< discountedPrices.length; i++){
            System.out.println("Original price = "+ originalPrices[i] +", Discounted Price = "+ discountedPrices[i]);
        }
    }   
}