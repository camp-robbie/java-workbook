package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                int mul = i * j;
                System.out.print(j + "*" + i + "=" + mul + "\t");
            }
            System.out.println();
        }
    }
}