import java.io.*;
public class readFromFile2 {
    public static void main(String[] args) throws Exception{
     FileInputStream fis=new FileInputStream("C:/Users/dnvma/OneDrive/Desktop/java fileHandling/ex.txt");
     byte[] a=new byte[fis.available()];
     fis.read(a);
     String str=new String(a);
        System.out.println(str);
    }
}
