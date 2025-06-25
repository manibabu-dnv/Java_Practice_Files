import java.lang.*;
class MyArray<T>{
    T array[]=(T[])new Object[10];
    int length=0;
    public void append(T v){
        array[length++]=v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(array[i]);
        }
    }
}
public class GenericsArray {
    public static void main(String[] args) {
        MyArray<Integer> obj=new MyArray<>();
        obj.append(10);
        obj.append(20);
        obj.append(30);
        obj.display();
    }
}
