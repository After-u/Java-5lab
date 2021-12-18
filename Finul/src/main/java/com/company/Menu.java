package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Menu {
    private static final Logger logger = LogManager.getLogger(Menu.class);
    public static void launch_menu() throws IOException, CalculatorException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator();
        while (true) {
            annotation();
            switch (reader.readLine()){
                case "1" -> {
                    logger.info("Использован 1 пункт меню");
                    System.out.println("Введите комманды: ");
                    while (true)
                    {
                        String s = reader.readLine();
                        if (s.equalsIgnoreCase("EXIT")) {
                            logger.info("Ввод закончен возврат к главному меню");
                            break;}
                        try {

                            calculator.addCommand(s);

                        }
                        catch (CalculatorException c)
                        {
                            c.printStackTrace();
                        }
                    }

                }
                case "2" -> {
                    logger.info("Использован 2 пункт меню");
                    System.out.print("Введите имя файла: \n");
                    String file = reader.readLine();
                    reading_file(file,calculator);

                }
                case "3"->{
                    logger.info("Завершение программы");
                reader.close();
                System.exit(0);
                }
                default -> {
                    System.out.println("В меню нет такого пункта");
                    logger.info("Выбран не существущий пункт меню");
                }
            }
        }
    }

    public static void annotation() {
    System.out.println(
            "1. Ввести команды с консоли\n" +
            "2. Ввести команды из файла\n" +
            "3. Выйти");
    }

    public static void reading_file(String file, Calculator calculator) throws CalculatorException, IOException {
        if (getFile(file)) {
            calculator.addFile(file);
        } else {
            logger.debug("Файл введенный");
            System.out.println("Нет такого файла\n");
        }
    }

    static boolean getFile(String name){
        try {

            Path path = Paths.get("C:\\Users\\Олег\\Desktop\\"+name);
            return Files.exists(path) ? true : false;

        } catch (Exception e) {
            return false;
        }

    }

}
