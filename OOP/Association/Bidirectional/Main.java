package OOP.Association.Bidirectional;

public class Main {
    public static void main(String[] args) {
        Team gigi = new Team();
        Developer sajith = new Developer();
        sajith.setTeams(gigi);
    }
}
