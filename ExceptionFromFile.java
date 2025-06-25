import java.util.*;
import java.io.*;
public class ExceptionFromFile {
    static void meth1()throws Exception{
        try(FileInputStream fi=new FileInputStream("C:/Users/dnvma/OneDrive/Desktop/array.txt");Scanner sc=new Scanner(fi)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=sc.nextInt();
            int f=sc.nextInt();
            int g=c/b;
            System.out.println(g);
        }
    }
    public static void main(String[] args)throws Exception {
        try{
            meth1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
