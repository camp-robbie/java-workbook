package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        // 값이 40 이상이면 break
        // 최종 합 출력

        // 조건(continue 사용) 추가
        for (int i = 1; i <= 50; i++) {
            if (i >= 40) {
                break;
            } else if (i % 3 != 0 || i % 5 == 0) {
                continue;
            }
            sum += i;
        }

        // 조건(continue 사용) 누락
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0 && i % 5 != 0) {
//                sum += i;
//            } else if (i >= 40) {
//                break;
//            }
//        }

        /*
        // solution
        for (int i = 0; i <= 50; i++) {
            // 40 이상이면 반복문 종료
            if (i >= 40) {
                break;
            }

            // 3의 배수가 아니면 건너뛰기
            if (i % 3 != 0) {
                continue;
            }

            // 5의 배수이면 건너뛰기 (3의 배수이면서 5의 배수가 아닌 수만 처리)
            if (i % 5 == 0) {
                continue;
            }

            // 조건을 만족하는 수를 합산
            sum += i;
        }
        */

        System.out.println(sum);
    }
}