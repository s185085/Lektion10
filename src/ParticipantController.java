import java.util.Scanner;

public class ParticipantController {

    public ParticipantController(){

    }
    public Participant registerParticipant(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter e-mail:");
        String email = input.nextLine();
        System.out.println("Enter password:");
        String password = input.nextLine();
        System.out.println("Enter name:");
        String name = input.nextLine();
        System.out.println("Enter age:");
        int age = input.nextInt();

        Participant participant = new Participant(email, password, name, age);

        return participant;
    }
}
