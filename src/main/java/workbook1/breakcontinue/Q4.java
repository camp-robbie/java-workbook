package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue

        for (int dan = 2; dan <= 9; dan++) {

            for (int i = 1; i <= 9; i++) {
                int result = dan * 1;

                if (result >= 30) {
                    continue;
                }
                System.out.println(dan + "*" + i + "=" + result);
            }

        }
    }
}