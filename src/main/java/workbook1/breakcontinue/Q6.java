package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        // 값이 40 이상이면 break
        // 최종 합 출력
        // 1부터 50까지의 정수 중 3의 배수이지만 5의 배수는 아닌 수를 모두 더한 값을 출력하는 프로그램을 작성하시오.
        // 단, 40 이상이면 더하지 않고 종료한다.
        // for 문과 continue, break를 조합하여 구현합니다.

        for (int i = 1; i <= 50; i++) { // 1부터 50까지의 정수
            // 40 이상이면 더하지 않고 종료한다.
            if (i >= 40) { //40 이상
                break; // break
            }

            if (i % 3 != 0 || i % 5 == 0) {
                continue;
            }

            sum += i;
        }
        System.out.println(sum); // 최종 합 출력
    }
}

// continue 사용이 안되어서 x
//        for (int i = 1; i <= 50; i++) { // 1부터 50까지의 정수
//        if (i % 3 == 0 && i % 5 != 0) { // 3의 배수이고 5의 배수가 아닌 경우만 합산
//            sum += i;
//        }