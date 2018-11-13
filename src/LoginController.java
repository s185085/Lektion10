import java.util.Scanner;

//Max Gammelgaard, racist!
public class LoginController {
public void run()

    {
        Scanner keyboard = new Scanner(System.in);
// user types in credentials
        String inputUsername = keyboard.nextLine();
        String inputPassword = keyboard.nextLine();

        if (inputUsername.equals(inputUsername) && inputPassword.equals(inputPassword)) {

            System.out.println("Login successful");
        } else {
            System.out.println("Login failed, try again");

        }

    }
}

