class GetSet{
    private int a;
    public void Setter(int b){
        this.a=b;
    }
    public int Getter(){
        return a;
    }
}
public class Getters_Setters {
    public static void main(String[] args) {
        GetSet obj =new GetSet();
        int b=10;
        obj.Setter(b);
        //obj.b=10;
        System.out.println(obj.Getter());

    }
}
