package OOP.Association.uniDirectional;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order(new PaymentGateway());
        o1.checkOut();
    }
}
