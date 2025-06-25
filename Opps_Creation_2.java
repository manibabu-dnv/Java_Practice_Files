class Cellphone{
    public void CallAFriend(){
        System.out.println("Call A Friend....");
    }
    public void Calling(){
        System.out.println("Calling A Friend....");
    }
    public void Ringing(){
        System.out.println("Ringing....");
    }
}
public class Opps_Creation_2 {
    public static void main(String[] args) {
        Cellphone realme=new Cellphone();
        realme.CallAFriend();
        realme.Calling();
        realme.Ringing();
    }
}
