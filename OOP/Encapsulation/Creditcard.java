package OOP.Encapsulation;

public class Creditcard {
    private double amount;
    private String cardNum;
    Creditcard(String cardNum ,double amount)
    {
        this.cardNum = cardNum;
        this.amount = amount;
        System.out.println("Card initialized");
    }
    public double getAmount()
    {
        //1234567890
        System.out.println("Amount withdrawn from *******"+cardNum.substring(cardNum.length()-4));
        return amount;
    }

}
