class Cylinde{
    private int Radius;
    private int Height;
    public int setRadius(int r){
        return this.Radius=r;}
    public void getRadius(){
        System.out.println("The value of Radius is: "+Radius);}
    public int setHeight(int h){
        return this.Height=h;}
    public void getHeight(){
        System.out.println("The value of height is: "+Height);}
}
public class Cylinderr {
    public static void main(String[] args) {
        Cylinde cy=new Cylinde();
        int a=5;
        int b=10;
        cy.setRadius(a);
        cy.setHeight(b);
        cy.getRadius();
        cy.getHeight();
    }
}
