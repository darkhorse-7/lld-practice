package OOP;
//class
class Car
{
    private String name;
    private int speed;
    Car(String name , int speed)
    {
        this.name = name;
        this.speed = speed;
    }
    public void display()
    {
        System.out.println(name+" "+speed);
    }
}

public class classObject {
public static void main(String[] args)
{
    //object
    Car audi = new Car("audi",25);
    audi.display();
}
}