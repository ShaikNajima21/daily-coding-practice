// Problem: Sum of Digits
// Language: Java
// Author: Shaik Najima

public class Day16_SumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}
