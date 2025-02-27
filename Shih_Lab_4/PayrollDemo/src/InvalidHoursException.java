/**
 * Exception thrown when hours exceeds 84 hours or is below 0 hours.
 * Written by Winston Shih
 * Written on 6/28/2023
 * JDK Version 17.0.1
 */
public class InvalidHoursException extends Exception{
    public InvalidHoursException()
    {
        super("Error: Invalid Hours.");
    }
}
