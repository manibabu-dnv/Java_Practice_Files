import java.util.Scanner;
public class ScannerTest {
    public static void main(String args[]){
        Scanner test=new Scanner(System.in);
        System.out.println("Enter the first subject marks: ");
        int a=test.nextInt();
        System.out.println("Enter the second subject marks: ");
        int b=test.nextInt();
        System.out.println("Enter the third subject marks: ");
        int c=test.nextInt();
        System.out.println("Enter the fourth subject marks: ");
        int d=test.nextInt();
        System.out.println("Enter the fifth subject marks: ");
        int e=test.nextInt();
        int f=a+b+c+d+e;
        float g=(f/500.0f)*100;
        System.out.println("Your percentage is: "+g+"%");
    }
}