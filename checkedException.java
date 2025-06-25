public class checkedException {
    static void method1(){
        try{
            int a=10/0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void method2(){
        method1();
    }
    static void method3(){
        method2();
    }
    public static void main(String[] args) {
        method3();
    }
}
