package OOP.Interfaces;

public class main {
    public static void main(String[] args){
        payment1 p1 = new payment1();
        payment2 p2 = new payment2();
        mainPayment mp = new mainPayment(p1);
        mainPayment mp1 = new mainPayment(p2);
        mp.checkOut(100);
        mp1.checkOut(2);
    }
}
