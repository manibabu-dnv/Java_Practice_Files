public class Sum_Array {
    public static void main(String[] args) {
        float[] arr={4.0f,5.0f,8.2f,4.8f};
        float sum=0;
        for(float calc:arr){
            sum+=calc;
        }
        System.out.println(sum);
    }
}
