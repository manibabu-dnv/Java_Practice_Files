import java.util.*;
public class ArrayListWithoutGenerics {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add("Apple");
        obj.add(123);
        obj.add(45.67);
        obj.add('A');
        obj.add(true);
        String s=(String) obj.get(0);
        System.out.println("First element: "+s);
        int i1=(Integer)obj.get(1);
        System.out.println("Second element: "+i1);
        System.out.println("Printing ArrayList without Generics using Iterator:");
        Iterator iterator=obj.iterator();
        while(iterator.hasNext()){
            Object element=iterator.next();
            System.out.println(element);
        }
        obj.add("banana");
        System.out.println("\nArrayList after modifications: ");
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i));
        }
    }
}
