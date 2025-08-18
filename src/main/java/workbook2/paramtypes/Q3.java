package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {
    // TODO: swapStrings 메서드 작성 (배열을 받아 두 문자열을 교환)
    public static void swapStrings(String[] arr){
        String temp = arr[0]; // 임시 저장
        arr[0] = arr[1]; // 첫 번째에 두 번째 값 복사
        arr[1] = temp;  // 두 번째에 첫 번째 값 저장
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String[] arr = {s1, s2};

        swapStrings(arr);
        // TODO: arr[0], arr[1] 출력
        System.out.println(arr[0]+" "+arr[1]);
    }
}
