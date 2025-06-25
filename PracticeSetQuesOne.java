import java.util.Scanner;
public class PracticeSetQuesOne{
    public static void main(String[] args) {
        Scanner sum=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a=sum.nextInt();
        System.out.println("Enter number 2: ");
        int b=sum.nextInt();
        System.out.println("Enter number 3: ");
        int c=sum.nextInt();
        System.out.println("The sum of three number is: ");
        int d=a+b+c;
        System.out.println(d);
    }
}