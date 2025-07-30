import java.util.*;

public class MergeSortFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println("Enter 5 numbers for first list:");
        for (int i = 0; i < 5; i++)
            list1.add(sc.nextInt());

        System.out.println("Enter 5 numbers for second list:");
        for (int i = 0; i < 5; i++)
            list2.add(sc.nextInt());

        List<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);

        System.out.println("\nMerged List: " + merged);

        Collections.sort(merged);
        System.out.println("Sorted List: " + merged);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Elements before " + n + ": ");
        for (int x : merged)
            if (x < n)
                System.out.print(x + " ");

        System.out.print("\nElements after " + n + ": ");
        for (int x : merged)
            if (x > n)
                System.out.print(x + " ");

        sc.close();
    }
}
