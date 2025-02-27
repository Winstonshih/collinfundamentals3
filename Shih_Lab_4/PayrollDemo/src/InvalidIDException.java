/**
 * Exception thrown when ID is below 0.
 * Written by Winston Shih
 * Written on 6/28/2023
 * JDK Version 17.0.1
 */
public class InvalidIDException extends Exception{
    public InvalidIDException()
    {
        super("Error: Invalid Employee ID.");
    }
}
