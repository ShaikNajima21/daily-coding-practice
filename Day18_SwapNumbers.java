// Problem: Swap Two Numbers (With & Without Temp)
// Language: Java
// Author: Shaik Najima

public class Day18_SwapNumbers {
    public static void main(String[] args) {

        int a = 5, b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping using temp: a = " + a + ", b = " + b);
        a = 5;
        b = 10;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping without temp: a = " + a + ", b = " + b);
    }
}
