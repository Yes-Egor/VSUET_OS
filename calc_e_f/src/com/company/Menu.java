package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void Menu() {
        ArrayList<String> story = new ArrayList<String>();
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("---------Меню---------");
        System.out.println("Введите 1 что бы показать меню");
        System.out.println("Введите 2 что бы посчитать пример");
        System.out.println("Введите 3 что бы посмотреть историю");
        System.out.println("Введите 4 что бы увидеть инструкцию");
        System.out.println("Введите 5 что бы сохранить");
        System.out.println("Введите 0 что бы выйти");
        System.out.println("----------------------");
        do {
            command = scanner.nextLine();
            switch (command) {
                case "1":
                    System.out.println("---------Меню---------");
                    System.out.println("Введите 1 что бы показать меню");
                    System.out.println("Введите 2 что бы посчитать пример");
                    System.out.println("Введите 3 что бы посмотреть историю");
                    System.out.println("Введите 4 что бы увидеть инструкцию");
                    System.out.println("Введите 5 что бы сохранить");
                    System.out.println("Введите 0 что бы выйти");
                    System.out.println("----------------------");
                    break;
                case "2":
                    Scanner in = new Scanner(System.in);
                    System.out.print("Введите пример: ");
                    String str = in.nextLine();
                    System.out.println(str+'='+calc.decide(str));
                    story.add(str+"="+calc.decide(str));
                    break;
                case "3":
                    story.toString();
                    System.out.println(story);
                    break;

                case "4":
                    System.out.println("Сложение: a+b" +'\n'+"Вычитание: a-b"+'\n'+"Умножение a*b"+'\n'+"Деление: a/b"+'\n'+"Возведение в степень: a^b"+'\n'+"Логарифм a по основанию b: a l b"+'\n'+"Остаток от деления: a%b");
                    break;

                case "5":

                    System.out.println("Введите название файла, укажите расширение. Пример: History.txt");
                    String name = scanner.nextLine();
                    System.out.println("Введите путь файла. Пример: C:/Users/user/Documents");

                    String path = scanner.nextLine();
                    SaveToFile save = new SaveToFile(path, name);
                    save.save(story);

                    break;

            }
        }
        while (!command.equals("0")) ;
    }
}
