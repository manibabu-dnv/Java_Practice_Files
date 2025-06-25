import java.util.Scanner;
public class PracticeSetIVQuesFive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year");
        int year=sc.nextInt();
        boolean boo=false;
        if(year%4==0){
                boo=true;
                if(year%100==0){
                    boo=true;
                    if(year%400==0){
                        boo=true;
                    }
                }
        }else{
            boo=false;
        }
        if(boo){
            System.out.println("Its a leap year!!!");
        }else{
            System.out.println("Its not a leap year!!!");
        }
    }
}