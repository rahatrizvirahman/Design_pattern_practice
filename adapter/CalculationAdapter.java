public class CalculationAdapter implements CalculationProvider{
    Calculator calculator;

    public CalculationAdapter(Calculator calc){
        this.calculator = calc;
    }

    public double[] multiplyAll(double devider, double[] values){
        return calculator.multiplyAll(values, devider);
    }
}