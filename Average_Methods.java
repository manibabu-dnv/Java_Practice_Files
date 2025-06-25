public class Average_Methods {
    static int average(int ...arr){
        int avg=0;
        for(int i=0;i<arr.length;i++){
            avg+=arr[i];
        }
        int c=avg/arr.length;
        return avg;
    }
    public static void main(String[] args) {
        int resul= average(91,62,62,63,86);
        System.out.println(resul);
    }
}
