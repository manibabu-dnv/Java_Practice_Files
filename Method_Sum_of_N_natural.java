public class Method_Sum_of_N_natural {
    static int sum(int a){
        int b=0;
        for(int i=1;i<=a;i++){
            b+=i;
        }
        System.out.println(b);
        return 0;
    }
    public static void main(String[] args) {
        sum(50);
    }
}
