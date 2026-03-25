// Problem: Find Second Largest Element in Array
// Language: Java
// Author: Shaik Najima

public class Day7_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element: " + second);
        }
    }
}
