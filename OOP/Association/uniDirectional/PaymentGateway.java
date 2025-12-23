package OOP.Association.uniDirectional;

public class PaymentGateway {
    private double amount;
    public void checkOut(double amount)
    {
        this.amount = amount;
        System.out.println("amount initialized");
    }
}
