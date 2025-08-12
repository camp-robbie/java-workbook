package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q4 {
    // TODO: concatStrings 메서드 작성
    public static String concatStrings(String str1, String str2){
        return str1 + str2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // TODO: concatStrings 호출 후 결과 출력
        String concatStrings = concatStrings(s1, s2);
        System.out.println(concatStrings);
        sc.close();
    }
}