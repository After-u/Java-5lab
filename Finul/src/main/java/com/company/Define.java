
package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.Stack;


public class Define extends Command {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    String var;
    Double value = null;
    String[] args;
    Map<String,Double> definitions;


    public Define(Stack<Double> stack, Map<String, Double> definitions) 
    {
        super(stack);
        this.args = args;
        this.definitions = definitions;
    }

    public void addArgument(String[] args) throws CalculatorException {
        if (args.length < 3) throw new WrongCommand("Wrong command");
        this.var = args[1];
        try {
            this.value = Double.valueOf(args[2]);
        } catch (NumberFormatException n) {

        }
    }

    @Override
    public void execute() {

        try{
            if (args.length < 3) throw new WrongCommand("Wrong command");
            this.var = args[1];
            this.value = Double.valueOf(args[2]);

            definitions.put(var,value);
        } catch (WrongCommand|NumberFormatException c){
            System.out.println("Wrong command");
            logger.debug("Команда Define введена неверно");
        }
    }


}
