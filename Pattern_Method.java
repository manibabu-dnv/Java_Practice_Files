public class Pattern_Method {
    static int pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args)
    {
        //Pattern_Method a=new Pattern_Method();
        //a.
                pattern(5);
        //pattern(5);
    }
}