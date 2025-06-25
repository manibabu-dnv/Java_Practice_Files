import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C:/Users/dnvma/OneDrive/Desktop/java fileHandling/ex.txt");
            String str="abcdefghijklmnopqrstuvwxyz";
            fos.write(str.getBytes());
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
