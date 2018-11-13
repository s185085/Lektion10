import java.util.Scanner;

public class ParticipantController {

    public ParticipantController(){

    }
    public Participant registerParticipant(RegistrationData rData){

        Participant participant = new Participant(rData.getEmail(), rData.getPassword(), rData.getName(), rData.getAge());

        return participant;
    }
}
