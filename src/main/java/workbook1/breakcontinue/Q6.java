package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        // 값이 40 이상이면 break
        // 최종 합 출력

        /// 문제 분석
        // 숫자 1부터 50까지
        // 3의 배수이면서 5의 배수가 아닌 수만 합산
        // 하지만 값이 40이상이면 더하지 않고 종료 break

        Q6loop:     // 문제Q6 라벨 지정
        for (int num = 1; num <= 50; num++) {
            if (num >= 40) {        // 하면 반복 종료 (이전까지는 누적)
                break Q6loop;       // 값이 40 이상이면 break
            }
            if (num % 3 != 0 || num % 5 == 0) {
                continue Q6loop;       // "3의 배수이면서 5의 배수가 아닌" 조건에 맞지 않으면 건너뜀
            }
            sum += num;
        }
        System.out.println("최종 합: " + sum);
    }
}