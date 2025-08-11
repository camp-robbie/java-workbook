package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {
    // TODO: swapStrings 메서드 작성 (배열을 받아 두 문자열을 교환)
    private static void swapStrings(String[] arr){
        String tempString = arr[0];
        arr[0] = arr[1];
        arr[1] = tempString;
    }

    //안되는 경우
    private static void swap(String s1, String s2){
        String tempS = s1;
        s1 = s2;
        s2 = tempS;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String[] arr = {s1, s2};
        swapStrings(arr);

        //TODO : arr[0], arr[1] 출력
        System.out.println("== 참조형(배열)을 이용한 문자열 교환 ==");
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //안되는 경우
        System.out.println("\n== 기본형 매개변수를 이용한 문자열 교환 시도 (실패) ==");
        swap(s1, s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
