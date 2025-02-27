/**
* This is a demo program to test the EmergencyRoom class implementation.
* Written on 7/23/2023
* @author Winston Shih and COSC 2436.910 Summer 2023
* JDK Version 17.0.1
*/
import java.util.concurrent.TimeUnit;
import java.time.*;
public class EmergencyRoomDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        EmergencyRoom eRoom = new EmergencyRoom(new PatientComparator());
        eRoom.checkIn(new Patient("Mirabella Jones", LocalDate.of(1973, 7, 11)), Severity.SEVEN);
        TimeUnit.MILLISECONDS.sleep(10);
        eRoom.checkIn(new Patient("Ruth Mendez", LocalDate.of(1965, 1, 22)), Severity.SEVEN);
        TimeUnit.MILLISECONDS.sleep(10);
        eRoom.checkIn(new Patient("Melvin Ingram", LocalDate.of(1965, 1, 22)), Severity.SEVEN);
        TimeUnit.MILLISECONDS.sleep(10);
        eRoom.checkIn(new Patient("Tara Silva", LocalDate.of(1975, 5, 8)), Severity.EIGHT);
        TimeUnit.MILLISECONDS.sleep(10);
        eRoom.checkIn(new Patient("Jeff Barnes", LocalDate.of(1968, 12, 19)), Severity.EIGHT);
        for (Patient patient = eRoom.admit(); patient != null; patient = eRoom.admit()) {
            System.out.println(patient.toString() + " admitted\n");
	}
    }
    
}
