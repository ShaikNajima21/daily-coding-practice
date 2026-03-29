// Problem: Fibonacci Series (Recursion + Loop)
// Language: Java
// Author: Shaik Najima

public class Day11_Fibonacci {
    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
    public static void main(String[] args) {
        int n = 7;
        int a = 0, b = 1;
        System.out.print("Fibonacci using loop: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        System.out.print("Fibonacci using recursion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRecursive(i) + " ");
        }
    }
}
