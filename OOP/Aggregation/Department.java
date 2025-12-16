package OOP.Aggregation;

import java.util.List;

public class Department {
    private List<professor> p;
    private String name;
    Department(List<professor> p,String name)
    {
        this.p = p;
        this.name = name;
    }
    // can print stuff as needed
}
