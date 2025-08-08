package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력

        for (int i = 2; i <= 9; i++) {
            System.out.print("  "+ i + "단\t");
        }
        System.out.println();

        for (int j = 1; j <= 9; j++) {
            for (int i = 2; i <= 9; i++) {
                System.out.print(i + "X" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}