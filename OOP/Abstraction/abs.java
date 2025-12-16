package OOP.Abstraction;

abstract class abs {
    String name;
    abs(String name)
    {
        this.name = name;
    }
    abstract void start();
    void display()
    {
        System.out.println("Name: "+name);
    }
    
}
