import java.util.Scanner;
/*
Задача 6: Да се прочете число от екрана(конзолата) и да се изведе сбора на всички
числа между 1 и въведеното число.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter whole number: ");
        int num = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <=num; i++) {
            sum += i;
        }

        System.out.println("Sum of all number between 1 and " + num + " is: " +sum);
    }
}