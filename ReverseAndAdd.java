import java.util.Scanner;

public class ReverseAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int original = scanner.nextInt();

        int number = original;
        int reversed = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        int sum = original + reversed;

        // Count odd and even digits in the sum
        int temp = sum;
        int oddCount = 0;
        int evenCount = 0;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            temp = temp / 10;
        }

        // Output
        System.out.println("Reversed number: " + reversed);
        System.out.println("Sum: " + original + " + " + reversed + " = " + sum);
        System.out.println("Even digits in sum: " + evenCount);
        System.out.println("Odd digits in sum: " + oddCount);

        scanner.close();
    }
}
