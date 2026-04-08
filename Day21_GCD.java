// Problem: Find GCD (Greatest Common Divisor)
// Language: Java
// Author: Shaik Najima

public class Day21_GCD {
    public static void main(String[] args) {
        int a = 48, b = 18;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD is: " + a);
    }
}
