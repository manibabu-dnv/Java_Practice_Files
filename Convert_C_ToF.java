public class Convert_C_ToF {
    static double selcius(double n){
        double farenheit=33.8;
        double conversion=n*farenheit;
        return conversion;
    }
    public static void main(String[] args) {
        System.out.println(selcius(10));
    }
}
