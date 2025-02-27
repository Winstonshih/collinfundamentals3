/**
 * Exception thrown when name is an empty string.
 * Written by Winston Shih
 * Written on 6/28/2023
 * JDK Version 17.0.1
 */
public class InvalidNameException extends Exception{
    public InvalidNameException()
    {
        super("Error: Invalid Employee Name.");
    }
}
