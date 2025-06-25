public class Star {
    public static void main(String[] args) {
        int a=7;
        int i=a;
        while(i>=1){
            int j=0;
            while(j<i){
                System.out.print("*");
                //System.out.print("\n");
                j++;
            }
            i--;
            System.out.println("\n");
        }
        //System.out.println("\n");
    }
}
