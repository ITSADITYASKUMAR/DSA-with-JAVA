package LEC15;

import java.util.Scanner;

public class Leetcode647_palindrome {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        int res = sol(str);

        System.out.println(res);

        scn.close();
    }

    public static int sol(String str) {

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                String s = str.substring(i, j + 1);

                boolean res = palindrome(s);

                if (res == true) {
                    cnt += 1;
                }
            }
        }

        return cnt;
    }

    public static boolean palindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}