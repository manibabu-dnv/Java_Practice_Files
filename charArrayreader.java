import java.io.*;
public class charArrayreader {
    public static void main(String[] args) throws Exception{
        char[] c={'a','b','c','d','c','e'};
        CharArrayReader car=new CharArrayReader(c);
        int x;
        while((x=car.read())!=-1){
            System.out.print((char)x+" ");
        }
    }
}
