import java.util.Scanner;

public class task_2 {
    public static void main(String[] args)
    {
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in); // input 
        String name = scanner.next(); // readline
        System.out.println("Привет,".concat(name)); // конкатинация
        scanner.close();
    }
}