package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {
    // TODO: swapStrings 메서드 작성 (배열을 받아 두 문자열을 교환)
    // 문자열 두 개를 입력받아 서로 값을 교환하는 메서드를 작성하시오. 단, 기본형 매개변수를 사용하여 교환하는 것이 불가능함을 보여주고, 배열을 사용하여 교환하는 방식을 구현한다.
    // 두 문자열을 요소로 가진 String[] 배열을 만들고, 메서드에서 배열 요소를 교환합니다.
    public static void swapStrings(String[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        String temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String[] arr = {s1, s2};
        swapStrings(arr);

        // TODO: arr[0], arr[1] 출력
            System.out.println(arr[0] + " " + arr[1]);
    }
}
