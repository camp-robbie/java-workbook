package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println(dan + "단");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
            System.out.println(); // 단 사이 줄바꿈
        }
    }
}