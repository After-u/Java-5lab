
package com.company;
import java.lang.Exception;
public class CalculatorException extends Exception {
    public CalculatorException() {
    }

    public CalculatorException(String message)
    {
        super(message);
    }
}
