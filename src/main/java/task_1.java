/*
Задание №1

        Написать программу, которая запросит пользователя ввести
<Имя> в консоли.
        Получит введенную строку и выведет в консоль сообщение
        “Привет, <Имя>!”

 */

/*
 * task_1
 */

import java.util.Scanner;

public class task_1 {

        public static void main(String[] args) {
                Scanner iScanner = new Scanner(System.in);
                System.out.printf("Enter your name: ");
                String name = iScanner.nextLine();
                System.out.printf("Привет, %s!", name);
                iScanner.close();



        }
}