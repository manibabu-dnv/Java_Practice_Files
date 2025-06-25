import java.util.Scanner;
public class PracticeSetIVQuesSix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the URL");
        String url=sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("This URL is a commercial website!");
        }else if(url.endsWith(".org")){
            System.out.println("This URL is an organisation website!");
        }else if(url.endsWith(".in")){
            System.out.println("This URL is an Indian Website");
        }
    }
}
