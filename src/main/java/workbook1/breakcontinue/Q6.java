package main.java.workbook1.breakcontinue;

import org.w3c.dom.ls.LSOutput;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        // 출력 예시 오류...? 합계 값이 40이상인 값은 48 => 종료

        for (int i = 1; i <= 50; i++) {         // 1 ~ 50 범위

            if (i % 3 != 0 || i % 5 == 0) {     // 3의 배수가 아니거나 5의 배수이면
                continue;                       // 아래 합산 진행하지 않고 건너뜀 -> 다음 반복 진행
            }

            sum += i;                           // [3의 배수] + [5의 배수 아니면] => sum 에 i값 합

            if (sum >= 40){                     // 합산값이 40 이상이면
                break;                          // 반복문 종료
            }
        }

        System.out.println(sum);                // 최종 합 출력
    }
}
