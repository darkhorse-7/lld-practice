package OOP.Association.uniDirectional;

public class Order {
    private PaymentGateway payment;
    public Order(PaymentGateway payment)
    {
        this.payment = payment;
    }
    public void checkOut()
    {
        payment.checkOut(200);
    }
}
