

package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StackCalcException extends CalculatorException {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public StackCalcException() {
    }

    public StackCalcException(String message) {
        super(message);
        logger.debug("Недостаточно аргументов для совершения команды");
    }
}
