package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j >= 30){continue;};
                System.out.print(i + "*" + j + "=" + (i*j) + " ");
            }
            System.out.println();
        }
    }
}
