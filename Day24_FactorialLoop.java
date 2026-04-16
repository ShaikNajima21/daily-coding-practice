// Problem: Factorial using Loop
// Language: Java
// Author: Shaik Najima

public class Day24_FactorialLoop {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
