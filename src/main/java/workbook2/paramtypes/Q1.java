package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q1 {       // 기본형(primitive) 매개변수
    // TODO: primitiveParam 메서드 작성 (int x를 받아 x에 10을 더함)

    /**
     * 기본형 매개변수는 '값 자체'가 복사되어 전달됩니다.
     * 즉, 메서드 안에서 x를 바꿔도 호출한 쪽의 x에는 영향이 없습니다.
     */

    public static int primitiveParam(int x) {
        // 지역 변수 x는 '복사본'이므로 여기서 더해도 메서드 밖의 x는 변하지 않음
        x = x + 10;
        return x; // 바뀐 복사본을 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int result = primitiveParam(x); // TODO: primitiveParam 메서드 작성 후 주석 해제

        // TODO: 원래 x와 메서드 반환 값 출력

        // 요구 사항: 원래 x와 메서드 반환값 출력 → "5 15"
        // x는 여전히 5(변경 안 됨), result는 15
        System.out.println(x + " " + result);

        sc.close();
    }
}