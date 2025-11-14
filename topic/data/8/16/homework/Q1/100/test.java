/*
project : 
author  : PIN CHEN, TSAI
updated : 2025-11-14
detail  :
- Write a program to check whether two strings are anagrams.
- 檢查兩個字串是否是字母異位詞。字母重排不區分大小寫，空格將被忽略。
- 輸出結果為“Yes”或“No”。
*/

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        String s2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        sc.close();
        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int n : freq) {
            if (n != 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
