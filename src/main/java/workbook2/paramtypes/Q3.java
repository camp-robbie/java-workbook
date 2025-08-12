package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {
    // String temp를 사용해 배열의 순서를 바꾸기 전 저장하는 변수를 선언함. (지역 변수)
    public static void swapStrings(String[] arr){

        String temp = arr[0];

        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String[] arr = {s1, s2};

        // 메서드를 호출합니다.
        swapStrings(arr);

        // 향상된 for 문을 이용하여 출력합니다.
        for (String str : arr) {
            System.out.print(str+" ");
        }
    }
}
