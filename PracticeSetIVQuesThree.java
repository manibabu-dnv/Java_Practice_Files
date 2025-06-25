import java.util.Scanner;
public class PracticeSetIVQuesThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income: ");
        int a=sc.nextInt();
        if(a>=250000 && a<500000){
            System.out.println("The income tax should be paid is: "+a*0.05);
        }
        else if(a>=500000 && a<1000000){
            System.out.println("The income tax should be paid is: "+a*0.20);
        }else if(a>=1000000){
            System.out.println("The income tax should be paid is: "+a*0.30);
        }else{
            System.out.println("You need not to pay any tax!");
        }
    }
}
