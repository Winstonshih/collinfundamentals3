/**
 * Exception thrown when hourly rate exceeds $25/hr or is below $0/hr.
 * Written by Winston Shih
 * Written on 6/28/2023
 * JDK Version 17.0.1
 */
public class InvalidHourlyRateException extends Exception{
    public InvalidHourlyRateException()
    {
        super("Error: Invalid Hourly Rate.");
    }
}
