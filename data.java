class generics <T>{
    private T obj;
    public void setData(T v){
        obj=v;
    }
    public T getData(){
        return obj;
    }
}
public class data{
    public static void main(String[] args) {
    generics<Integer> abc=new generics<>();
    abc.setData(10);
        System.out.println(abc.getData());
    }
}
