package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        // 값이 40 이상이면 break
        // 최종 합 출력

        for (int i = 1; i <= 50; i++) {
            // 3의 배수가 아니면 건너뛰기
            if (i % 3 != 0) {
                continue; // 다음 숫자로 이동
            }

            // 5의 배수이면 건너뛰기
            if (i % 5 == 0) {
                continue; // 다음 숫자로 이동
            }

            // 값이 40 이상이면 종료
            if (i >= 40) {
                break; // 반복문 종료
            }

            // 조건을 만족하는 경우 합산
            sum += i;
        }

        // 최종 합계 출력
        System.out.println(sum);
    }
}