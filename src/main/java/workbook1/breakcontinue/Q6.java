package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 50 ; i++) {
            // 40 이상이라면 break;
            if(i >= 40){
                break;
            } else if (i % 3 != 0 || i % 5 == 0) {
                // 3의 배수가 아니거나 5의 배수라면 continue;
                continue;
            }
            // 위 if 문에 한 번도 걸리지 않았다면
            // 자동적으로 i는 3의 배수이며 5의 배수가 아닌 값이자
            // 40 미만의 값이 됩니다.
            sum += i;
        }

        // 최종 합 출력
        System.out.println(sum);
    }
}