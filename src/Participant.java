// Frederik

public class Participant {
    private String name;
    private String email;
    private String password;
    private int age;
    private boolean isLeader = false;
    private String cyclistType;
    private Team team;

    public Participant(String email, String password, String name, int age){
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
    }
}