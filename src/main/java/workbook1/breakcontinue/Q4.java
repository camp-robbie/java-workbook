package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue

        // 구구단을 출력한다.
        // 합이 30 이상이면 continue를 쓴다.

        for (int dan = 2; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                if (dan * i >= 30) {
                    continue;
                }
                System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
            }
            System.out.println();
        }
    }
}
