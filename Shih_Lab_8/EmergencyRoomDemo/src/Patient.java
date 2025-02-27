/**
* This program implements an emergency room patient.
* Written on 7/23/2023
* @author Winston Shih and COSC 2436.910 Summer 2023
* JDK Version 17.0.1
*/
import java.util.*;
import java.time.*;
public class Patient {
    private final String name;
    private final LocalDate DOB;
    private Severity severity;
    private LocalTime arrivalTime;
    public Patient(String n, LocalDate d)
    {
        name=n;
        DOB=d;
    }
    public String getName()
    {
        return name;
    }
    public LocalDate getDOB()
    {
        return DOB;
    }
    public Severity getSeverity()
    {
        return severity;
    }
    public LocalTime getArrival()
    {
        return arrivalTime;
    }
    public void setSeverity(Severity s)
    {
        severity=s;
    }
    public void setArrival(LocalTime arrival)
    {
        arrivalTime=arrival;
    }
    public String toString()
    {
        return getName()+"\n DOB="+getDOB()+"\n severity="+getSeverity()+"\n arrivalTime="+getArrival();
    }
}
