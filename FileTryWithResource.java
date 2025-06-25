import java.io.*;
import java.util.*;
public class FileTryWithResource {
    public static void main(String[] args) {
        String filepath="C:/Users/dnvma/OneDrive/Desktop/array.txt";
        try(Scanner reader=new Scanner(new File(filepath))){
            while(reader.hasNext()){
                System.out.println(reader.nextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
