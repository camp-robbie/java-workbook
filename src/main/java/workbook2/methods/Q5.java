package main.java.workbook2.methods;

import java.util.Scanner;

public class Q5 {
    // TODO: reverseStrings 메서드 작성
    private static String[] reverseStrings(String[] a){
        String [] reversedArray = new String[a.length];
        for(int i =0; i<a.length; i++){
            reversedArray[i] = new StringBuilder(a[i]).reverse().toString();
        }
        return reversedArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // TODO: reverseStrings 호출 후 결과 출력
        String[] s = reverseStrings(words);
        for (String string : s) {
            System.out.print(string + " ");
        }
    }
}