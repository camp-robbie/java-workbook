package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {

        // TODO: 구구단 전체를 출력
        // 2부터 9까지의 구구단을 세로 형태로 출력하는 프로그램을 작성하시오.
        // 중첩 for 문을 이용하여 행(19)과 열(29)을 반복합니다.

        for (int dan = 2; dan <= 9; dan++) { // 2부터 9까지의 구구단
            for (int i = 1; i <= 9; i++) { // 각 dan의 곱셈
                System.out.println(dan + "x" + i + "=" + (dan * i));
            }
            System.out.println();
        }
    }
}