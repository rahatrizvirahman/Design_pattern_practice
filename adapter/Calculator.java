public class Calculator{
    public double[] multiplyAll(double[] values, double multiplier){
        double[] multipliedValues = new double[values.length];

        for(int i =0; i< values.length; i++){
            multipliedValues[i] = values[i]*multiplier;
        }

        return multipliedValues;
    }
}