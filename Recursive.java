public class Recursive {
    static int factorial(int a){
        int b=1;
        for(int i=1;i<=a;i++){
            b*=i;
        }
        return b;
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println(factorial(x));
    }
}
