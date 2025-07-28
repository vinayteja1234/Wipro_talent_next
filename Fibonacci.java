public class Fibonacci {
    public static void main(String[] args) {
        int n = 3; // Length of the Fibonacci sequence
        int first = 0, second = 1;

        System.out.print("Fibonacci Series of " + n + " numbers: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + ", ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
