package main.java.workbook1.breakcontinue;

public class Q6 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1~50 중 3의 배수이지만 5의 배수는 아닌 값만 합산
        // 값이 40 이상이면 break
        // 최종 합 출력

        //1~50까지 반복
        for (int i = 1; i <= 50; i++) {
            //40 이상일 경우 break
            if (i >= 40) {
                break;
            }
            //3의 배수 5의 배수 조건에 안맞는 수는 다 넘어가기
            if (!(i % 3 == 0 && i % 5 != 0)) {
                continue;
            }
            //3의 배수이지만 5의 배수는 아닌 수는 sum에 더하기
            sum += i;
        }
        System.out.println(sum);
        //근데 출력 예시랑 달라요...
    }
}