import java.util.Scanner;

//Max Gammelgaard
public class LoginController {

    private ParticipantManager pM = new ParticipantManager();

    public void run() {
        Scanner keyboard = new Scanner(System.in);
        // user types in credentials
        String inputUsername = keyboard.nextLine();
        String inputPassword = keyboard.nextLine();

        if (inputUsername.equals(pM.getParticipant()) && inputPassword.equals(pM.getParticipant())) {

            System.out.println("Login successful");
        } else {
            System.out.println("Login failed, try again");
        }

        // if username and password is correct become currentParticipant
        if (inputUsername.equals(pM.getParticipant()) && inputPassword.equals(pM.getParticipant())){

        }

    }
}

