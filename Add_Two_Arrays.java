public class Add_Two_Arrays {
    public static void main(String[] args) {
        int[][] arr1={{5,5,5},{8,8,8}};
        int[][] arr2={{1,1,1},{2,2,2}};
        int[][] arr3={{0,0,0},{0,0,0}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.println(arr3[i][j]+" ");
                arr3[i][j]= arr1[i][j] + arr2[i][j];
            }
            System.out.println(" ");
        }
    }
}
