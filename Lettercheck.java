import java.util.Scanner;
public class Lettercheck {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Letter: ");
            char letter=sc.next().charAt(0);
            //char is_Upper=letter.is_Upper();
            //char is_lower=leter.is_lower();
            if(letter >='A' && letter<='Z'){
                System.out.println("1");
            }else if(letter >='a' && letter<='z'){
                System.out.println("0");
            }else{
                System.out.println("-1");
            }

        }
    }

