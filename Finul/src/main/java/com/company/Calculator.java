package com.company;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final String DEFINE = "DEFINE";
    private static final String DIVISION = ":";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String POP = "POP";
    private static final String PUSH = "PUSH";
    private static final String PRINT = "PRINT";
    private static final String SQRT = "SQRT";
    private static final String SUM = "+";

    protected Stack<Double> stack = new Stack<Double>();
    protected Map<String, Double> definitions = new HashMap<String, Double>();
    protected String[] args;
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public void addCommand(String s) throws CalculatorException {


        args = s.split(" ");
        if (args.length==0) return;
        Command c = null;

        String type = args[0];
        switch (type) {
            case DEFINE: {
                logger.info("Использована команда DEFINE");
                c = new Define(stack,definitions);
                ((Define) c).addArgument(args);
                break;
            }
            case DIVISION: {
                logger.info("Использована команда DIVISON");
                c = new Division(this.stack);
                break;
            }
            case MINUS: {
                logger.info("Использована команда MINUS");
                c = new Minus(stack);
                break;
            }
            case MULTIPLY: {
                logger.info("Использована команда MULTIPLY");
                c = new Multiply(stack);
                break;
            }
            case POP: {
                logger.info("Число снято со стека");
                c = new Pop(stack);
                break;
            }
            case PRINT: {
                logger.info("Число из стека выведено на консоль");
                c = new Print(stack);

                break;
            }
            case PUSH: {
                logger.info("Число добавлено в стек");
                c = new Push(stack,definitions);
                ((Push) c).setPush(args[1]);
                break;
            }
            case SQRT: {
                logger.info("Использована команда SQRT");
                c = new Sqrt(stack);
                break;
            }
            case SUM: {
                logger.info("Использована команда SUM");
                c = new Sum(stack);
                break;
            }
        }
        if (c != null) {
            c.execute();
        } 
        else{
            logger.debug("Команда введена не правильно");
            throw new WrongCommand("Wrong command");}
    }

    public void addFile(String s) throws CalculatorException, IOException {
        try {
            File file = new File("C:\\Users\\Олег\\Desktop\\" + s);
            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                addCommand(line);

                line = reader.readLine();

            }
        } catch (FileNotFoundException e) {
            logger.debug("Файла не существует!");


        }
    }
    void clear(){
        stack.clear();
        definitions.clear();
    }
}