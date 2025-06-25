public class Min_Array {
    public static void main(String[] args) {
        int[] arr={1,5,8,99,66,44,33,44,77,4};
        int i=Integer.MAX_VALUE;
        for(int element:arr){
            if(element<i){
                i=element;
            }
        }
        System.out.println(i);
    }
}
