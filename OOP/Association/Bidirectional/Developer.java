package OOP.Association.Bidirectional;

public class Developer {
    Team team = new Team();
    public void setTeams(Team team)
    {
        this.team= team;
        team.addDeveloper(this);
    }
}
