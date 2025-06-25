import java.io.*;
public class readfromFile4 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:/Users/dnvma/OneDrive/Desktop/java fileHandling/ex.txt");
        int x;
        while((x=fis.read())!=-1){
            System.out.print((char)x);
        }
    }
}
