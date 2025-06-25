import java.io.*;
public class readfromfile {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:/Users/dnvma/OneDrive/Desktop/java fileHandling/ex.txt");
        byte[] b=new byte[fis.available()];
        fis.read(b);
        String str=new String(b);
        System.out.println(str);
    }
}
