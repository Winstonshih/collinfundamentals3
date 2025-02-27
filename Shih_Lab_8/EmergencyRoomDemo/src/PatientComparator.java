/**
* This class implements a comparator that follows these rules:
* 1. Patients with a greater severity get priority. 
* 2. Older patients with the same severity get priority.
* 3. Patients with same age and severity who arrive earlier get priority.
* Written on 7/23/2023
* @author Winston Shih and COSC 2436.910 Summer 2023
* JDK Version 17.0.1
*/
import java.util.*;
public class PatientComparator implements Comparator<Patient>{
    @Override
	public int compare(Patient p1, Patient p2) {
            int ret = p2.getSeverity().compareTo(p1.getSeverity());
            if (ret == 0) 
            {
                ret = p1.getDOB().compareTo(p2.getDOB());
            }
            if(ret==0)
            {
                ret=p1.getArrival().compareTo(p2.getArrival());
            }
            return ret;
	}
}
