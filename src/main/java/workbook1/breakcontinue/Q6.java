package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        for (int i = 1; i <= 50; i++) {
            // 40 이상이면 반복문 종료
            if (i >= 40) {
                break;
            }
            if (i % 3 != 0) {
                continue;
            }
            if (i % 5 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}