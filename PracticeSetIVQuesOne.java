import java.util.Scanner;
public class PracticeSetIVQuesOne{
    public static void main(String[] args) {
        Scanner I=new Scanner(System.in);
        System.out.println("Enter the marks of the first subjeect: ");
        int a=I.nextInt();
        System.out.println("Enter the marks of the secid subject: ");
        int b=I.nextInt();
        System.out.println("Enter the marks of the third subject: ");
        int c=I.nextInt();
        int totalMarks=a+b+c;
        int totalPercentage=totalMarks/3;
        System.out.println(totalPercentage+"%");
        if(totalPercentage>40 && a>33 && b>33 && c>33){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}