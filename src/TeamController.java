import java.util.Scanner;

public class TeamController {

    public void createTeam (String currentParticipant){ //skal returnere at holdopretteren nu er en leder

        Scanner input = new Scanner(System.in);
        String teamName = input.nextLine();;

        TeamManager teamManager = new TeamManager();
        teamManager.addTeam(teamName, currentParticipant);

        input.close();
    }

    public void addParticipatToTeam(){

    }

    public void removeParticipatFromTeam(){

    }
}
