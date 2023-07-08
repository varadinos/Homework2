import java.util.Scanner;

/*
Задача 7: Започвайки от 3, да се изведат на екрана първите n числа които се делят
на 3. Числата да са разделени със запетая.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter whole number: ");
        int n = scanner.nextInt();

        for (int i = 3; i < n; i++) {
            if (i == 3){
                System.out.print(i);
            } else if (i % 3 == 0) {
                System.out.print(", " + i);
            }
        }

    }
}
