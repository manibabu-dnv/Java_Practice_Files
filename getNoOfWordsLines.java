import java.io.*;
public class getNoOfWordsLines {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/dnvma/OneDrive/Desktop/java fileHandling/ex.txt"));
            int lineCount = 0;
            int wordCount=0;
            String line;
            while ((line = br.readLine()) !=null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
    }
}