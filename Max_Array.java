public class Max_Array {
    public static void main(String[] args) {
        int[] arr={5,8,9,1,5,4,44,4,44,5555,22222};
        int mx=0;
        for(int element:arr){
            if(element>mx){
                mx=element;
            }
        }
        System.out.println(mx);
    }
}
