import java.util.*;
public class CheckArray {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add(23);
        obj.add("Leela");
        obj.add(23.44f);
        for(Object i:obj){
            System.out.println(i);
        }
    }
}
