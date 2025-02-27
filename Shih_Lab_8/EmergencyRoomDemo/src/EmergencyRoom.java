/**
* This class implements Emergency Room that has a priority queue for patients 
* to check in. Patient priority is determined by Patient Comparator.
* Written on 7/23/2023
* @author Winston Shih and COSC 2436.910 Summer 2023
* JDK Version 17.0.1
*/
import java.util.*;
import java.time.*;
public class EmergencyRoom {
    private final PriorityQueue<Patient> queue;
	public EmergencyRoom(Comparator<Patient> comparator) {
            queue= new PriorityQueue<>(comparator);
	}
	public void checkIn(Patient patient, Severity severity) {
            patient.setArrival(LocalTime.now());
            patient.setSeverity(severity);
            queue.add(patient);
	}
	public Patient admit() {
            if(queue.isEmpty())
            {
                return null;
            }
            else{
                return queue.remove();
            }
	}
}
