public class Array_Present_Or_Not {
    public static void main(String[] args) {
        int[] arr={5,8,9,4,6,1,2,4,4,8,55,5,5};
        int a=55;
        boolean is_in_array=false;
        for(int element:arr){
            if(element==a) {
                is_in_array = true;
            }
        }
        if(is_in_array){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
