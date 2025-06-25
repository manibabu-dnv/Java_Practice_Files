import java.sql.SQLData;

class Square{
    int side;
    public int Perimeter(){
        return 4*side;
    }
    public int area(){
        return side*side;
    }
}
public class Squares_calculation {
    public static void main(String[] args) {
        Square squ=new Square();
        squ.side=5;
        System.out.println(squ.Perimeter());
        System.out.println(squ.area());
    }
}
