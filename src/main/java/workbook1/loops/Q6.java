package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력

        for (int dan = 2; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
            }
            System.out.println();
        }
    }
}