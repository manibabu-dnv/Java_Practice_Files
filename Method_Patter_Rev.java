public class Method_Patter_Rev {
    static int pattern(int a){
        for(int i=a;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.format("*");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
