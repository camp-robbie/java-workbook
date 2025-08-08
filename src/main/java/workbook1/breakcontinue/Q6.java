package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0; // 합을 담을 변수
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {// 3의 배수이면서
                if (i % 5 == 0) { // 5의 배수라면
                    continue; // 반복문 안에 포함된 아래의 코드들은 무시하고 건너뜀
                }
                if (i >= 40) { // 값이 40 이상이면
                    break; // 종료
                }
                sum += i; // sum = sum + i;
            }
        }
        System.out.println(sum); // 최종 합 출력
    }
}