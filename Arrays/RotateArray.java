package Arrays;// Rotate an array to the right by 'key' positions
import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] arr, int key) {
        int n = arr.length;
        key = key % n; // to handle key > n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, key - 1);
        reverse(arr, key, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int key = 3;
        rotate(arr, key);
        System.out.println(Arrays.toString(arr)); // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
