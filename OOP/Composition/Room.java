class Room
{
    private String name;
    public Room(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("This is a "+name+" room.");
    }
}