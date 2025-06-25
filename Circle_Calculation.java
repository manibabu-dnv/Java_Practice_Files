class Circle{
    int Radius;
    public double perimeter(){
        return 2*Math.PI*Radius;
    }
    public double Area(){
        return Math.PI*Radius*Radius;
    }
}
public class Circle_Calculation {
    public static void main(String[] args) {
        Circle cir=new Circle();
        cir.Radius=5;
        System.out.println(cir.perimeter());
        System.out.println(cir.Area());

    }
}
