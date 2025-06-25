import java.util.Random;
import java.util.Scanner;
public class RockPaperSissors {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sign Rock/paper/sissors");
        String userInput=sc.next();

        String compValues[]={"rock","paper","sissors"};

        String compInput=compValues[new Random().nextInt(compValues.length)];
        System.out.println("Computer choosen: "+ compInput);

        if((userInput.equals(compInput))){
            System.out.println("Ughhh, Its a TIE !!!");
        }else if((userInput.equals("rock") && compInput.equals("sissors"))
        ||(userInput.equals("paper") && compInput.equals("rock")) 
        ||(userInput.equals("sissors") && compInput.equals("paper"))){
            System.out.println("Yaayyy! YOU WIN");
        }else{
            System.out.println("Oops, Computer WON");
        }
    }
}
