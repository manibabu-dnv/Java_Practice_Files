import java.io.*;
public class bytearayoutputStream {
    public static void main(String[] args)throws Exception{
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('A');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        byte b[]=bos.toByteArray();
        for(byte x:b){
            System.out.println(x);
        }
    bos.writeTo(new FileOutputStream("C:/Users/dnvma/OneDrive/Desktop/java fileHandling/abc.txt"));
    }
}
