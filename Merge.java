import java.util.Arrays;

public class Merge {

    public static int[] mergeAndSort(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        Arrays.sort(merged);
        return merged;
    }

    public static void main(String[] args) {
        int[] array1 = { 5, 3, 9 };
        int[] array2 = { 8, 1, 7 };

        int[] sortedMerged = mergeAndSort(array1, array2);

        System.out.println("Sorted merged array: " + Arrays.toString(sortedMerged));
    }
}
