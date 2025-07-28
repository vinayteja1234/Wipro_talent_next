import java.util.Scanner;

public class SecondDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            int secondDigit = (number / 10) % 10;
            System.out.println("The second digit is: " + secondDigit);
        } else {
            System.out.println("The number does not have a second digit.");
        }

        scanner.close();
    }
}
