public class Factorial_While {
    public static void main(String[] args) {
        int i=5;
        int j=5;
        int k=1;
        while(k<j){
            i=i*k;
            k++;
            //System.out.println(k);
        }
        System.out.println(i);
    }
}
