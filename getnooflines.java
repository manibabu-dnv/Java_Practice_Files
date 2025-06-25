import java.io.*;
public class getnooflines {
    public static void main(String[] args) throws FileNotFoundException {
        File fil=new File("C:/Users/dnvma/OneDrive/Desktop/java fileHandling/ex.txt");
        BufferedReader reader = new BufferedReader(new FileReader(fil));
        long lineCount = reader.lines().count();
        System.out.println("Total Number of Lines: " + lineCount);
    }
}