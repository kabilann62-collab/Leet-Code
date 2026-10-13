class Solution {
    public double[] convertTemperature(double celsius) {
        double [] a = new double[2];
        a[0]= ((celsius+273.15)*100000)/100000;
        a[1] = ((celsius*1.80+32.00)*100000)/100000;
        return a;
        
    }
}