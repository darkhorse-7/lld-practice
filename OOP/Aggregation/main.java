package OOP.Aggregation;

import java.util.List;

public class main {
    public static void main(String[] args) {
        professor s = new professor("s");
        professor l = new professor("l");
        List<professor> pf = List.of(s,l);
        Department d = new Department(pf,"ece");
        //department and professor are separate classes yet professor is linked via aggreation to department meaning it still exists even if we dept is deleted
    }
}
