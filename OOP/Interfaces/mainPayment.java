package OOP.Interfaces;

public class mainPayment {
    private payment p;
    mainPayment(payment p)
    {
        this.p = p;
    }
    public void checkOut(double amount)
    {
        p.initiatepayment(amount);
    }
}
