import java.io.*;
public class FileOutStream {
    public static void main(String[] args)throws Exception {
    try{
        FileOutputStream fos=new FileOutputStream("C:/Users/dnvma/OneDrive/Desktop/FileInputStreamExample.txt");
        String msg="Practicing FileInputStream in java for CA3.";
        fos.write(msg.getBytes());
    }
    catch(FileNotFoundException e){
            System.out.println(e);
    }
    catch (IOException e){
        System.out.println(e);
    }
    }
}
