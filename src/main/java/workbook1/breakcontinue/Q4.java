package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");

            for (int j = 1; j <= 9; j++) {
                int result = i * j;

                if (result >= 30) {
                    continue;
                }

                System.out.println(i + "*" + j + "=" + result);
            }
            System.out.println();
        }
    }
}
