class Rectangle{
    int length;
    int width;
    public int Perimeter(){
        return 2* (length + width);
    }
    public int Area(){
        return length*width;
    }
}
public class Rectangle_Calculation {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.length=10;
        rec.width=5;
        System.out.println(rec.Perimeter());
        System.out.println(rec.Area());
    }
}
