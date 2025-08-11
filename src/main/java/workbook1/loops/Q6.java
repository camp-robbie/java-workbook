package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력

        //각 단에 곱해지는 1~9까지의 숫자
        for (int i = 1; i <= 9; i++) {
            //각 행마다 2단, 3단, 4단..., 9단 출력
            for (int dan = 2; dan <= 9; dan++) {
                System.out.print(dan + "*" + i + "=" + (dan*i) + "\t");// "\t"를 이용하여 깔끔하게 줄 맞추기
            }
            System.out.println();
        }
    }
}