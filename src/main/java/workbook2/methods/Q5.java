package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    public String[] reverseStrings(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // TODO: reverseStrings 호출 후 결과 출력
        Q5 q5 = new Q5();
        String[] reversed = q5.reverseStrings(words);

        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
            if (i != reversed.length - 1) {
                System.out.print(" ");
            }
        }

//        for (String str : reversed) {
//            System.out.print(str + " ");
//        }

        System.out.println();

        sc.close();

    }
}