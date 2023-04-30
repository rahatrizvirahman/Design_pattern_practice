import java.util.Arrays;

public class Shop{
    private double[] prices = {100, 200, 350, 400};
    private double discount = 5;
    private CalculationProvider calculationProvider;

    public Shop(CalculationProvider calcProvider){
        this.calculationProvider = calcProvider;
    }

    public double[] getPrices(){
        return prices;
    }

    public double[] getDiscountedPrice(){
        double[] discounts = calculationProvider.multiplyAll(discount/100, prices);
        
        double[] finalPrice = new double[prices.length];
        
        for(int i=0; i<prices.length; i++){
            finalPrice[i] = prices[i] - discounts[i];
        }

        return finalPrice;
    }
}