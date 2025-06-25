public class nestedTryCatch {
    public static void main(String[] args) {
        int[] A={10,20,30,2,0};
        try{
            int c=A[0]/A[4];
            System.out.println("The output of the following is: "+c);
//            try {
//                System.out.println(A[6]);
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Invalid index number given!!");
//            }
        }
        catch(Exception e) {
            System.out.println("The denominator cannot be ZERO!!!");
        }
    }
}
