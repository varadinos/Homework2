import java.util.Scanner;

/*
Задача 5: Да се въведат от потребителя 2 числа. И да се изведат на екрана всички
числа от по-малкото до по-голямото.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter whole number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter whole number bigger than the previous one: ");
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2 ; i++) {
            System.out.println(i);
        }

    }
}
