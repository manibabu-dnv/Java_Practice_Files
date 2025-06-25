public class Average_Of_Array {
    public static void main(String[] args) {
        int[] arr={91,63,62,62,86};
        int a=0;
        int b=arr.length;
        for(int element:arr){
            a+=element;
        }
        System.out.println(a/b);
    }
}
