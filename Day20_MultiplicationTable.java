// Problem: Print Multiplication Table
// Language: Java
// Author: Shaik Najima

public class Day20_MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Multiplication Table of " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
