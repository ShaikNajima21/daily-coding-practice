// Problem: Count Vowels in a String
// Language: Java
// Author: Shaik Najima

public class Day25_CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
