package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {      // 배열로 문자열 swap
    // TODO: swapStrings 메서드 작성 (배열을 받아 두 문자열을 교환)

    /**
     * 기본형(예: int, double)처럼 '값'만 복사되면 서로 교환(swap) 효과가 밖에 반영되지 않습니다.
     * 그래서 같은 객체를 가리키는 '참조'를 공유하기 위해 String[] 배열을 사용합니다.
     * (String 자체는 불변이지만, '배열의 각 칸이 가리키는 참조'는 서로 바꿀 수 있음)
     */

    public static void swapStrings(String[] arr) {
        // 전제: arr 길이가 2라고 가정(문제 조건)
        String tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next(); // 입력: hello
        String s2 = sc.next(); // 입력: world

        String[] arr = {s1, s2};

        swapStrings(arr); // TODO: swapStrings 메서드 작성 후 주석 해제
        // TODO: arr[0], arr[1] 출력

        // 출력: "world hello"
        System.out.println(arr[0] + " " + arr[1]);

        sc.close();
    }
}
