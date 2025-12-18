import java.util.ArrayList;
import java.util.List;
public class House {
    private List<Room> rooms ;
    House()
    {
        rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Hall"));
        rooms.add(new Room("Kitchen"));
    }
    public void houseLayout()
    {
        for(Room r:rooms)
        {
            r.display();
        }
    }
}
