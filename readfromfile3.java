import java.io.*;
public class readfromfile3 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:/Users/dnvma/OneDrive/Desktop/java fileHandling/ex.txt");
        int x;
        do{
            x=fis.read();
            if(x!=-1){
                System.out.print((char)(x));
            }
        }while(x!=-1);
    }
}
