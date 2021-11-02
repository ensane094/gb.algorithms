package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Brackets test = new Brackets("((){}{}[][]");
        System.out.println(test.check());
    }

    static String reverseRead (String string){
        StringBuilder reverse = new StringBuilder();
        for (int i = string.length()-1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }
        String finalReverse = reverse.toString();
        return finalReverse;
    }
}
