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
        System.out.println(sum);
    }
}