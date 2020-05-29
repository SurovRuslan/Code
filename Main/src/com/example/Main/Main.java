import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберете действие: ");
            System.out.println("1. Сложение ");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("0. Выход");

            Scanner myObj = new Scanner(System.in);  // Create a object that can read user input
            String menuItem = myObj.nextLine();  // Read user input
            System.out.println("Действие " + menuItem);  // Output user input

            if (menuItem.contains("0") || menuItem.contains("exit")) {
                break;
            }

            switch (menuItem) {
                case "1":
                    System.out.println("Введите первое слагаемое: ");
                    int firstTerm = myObj.nextInt();
                    System.out.println("Введите второе слагаемое: ");
                    int secondTerm = myObj.nextInt();
                    System.out.println("Результат суммы: " + sum(firstTerm, secondTerm));
                    break;
                case "2":
                    System.out.println("Введите уменьшаемое: ");
                    int minuend = myObj.nextInt();
                    System.out.println("Введите вычитаемое: ");
                    int subtrahend = myObj.nextInt();
                    System.out.println("Результат вычитания: " + sub(minuend, subtrahend));
                    break;
                case "3":
                    System.out.println("Введите первый множитель: ");
                    int firstMult = myObj.nextInt();
                    System.out.println("Введите второй множитель: ");
                    int secondMult = myObj.nextInt();
                    System.out.println("Результат умножения: " + mult(firstMult, secondMult));
                    break;
                case "4":
                    System.out.println("Введите делимое: ");
                    int dividend = myObj.nextInt();
                    System.out.println("Введите делитель: ");
                    int divisor = myObj.nextInt();
                    System.out.println("Результат деления: " + div(dividend, divisor));
                    break;
            }
        }
    }

    public static int sum(int firstTerm, int secondTerm) {
        return firstTerm + secondTerm;
    }
    public static int sub(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
    public static int mult(int firstMult, int secondMult) {
        return firstMult * secondMult;
    }
    public static int div(int dividend, int divisor) {
        return dividend / divisor;
    }
}