package OOP.Association.Bidirectional;

import java.util.ArrayList;
import java.util.List;

public class Team {

    // a team has a list of developers 
    private List<Developer> devs = new ArrayList<>();
    public void addDeveloper(Developer d)
    {
        devs.add(d);
        System.out.println("new member is added to team");
    }
}
