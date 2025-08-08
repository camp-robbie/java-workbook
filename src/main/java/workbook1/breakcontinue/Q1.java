package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        // 합을 출력
        // 1부터 100까지의 정수 중에서 10의 배수가 나오면 반복을 종료하고, 그 이전까지의 합을 출력하는 프로그램을 작성하시오.
        // for 문과 break를 사용합니다.
        // 10의 배수인 10을 만나기 전까지 1+2+...+9의 합이 출력됩니다.

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) { // 10의 배수
                break; // 반복 종료
            }
            sum += i; // 그 이전까지의 합
        }
        System.out.println(sum); // 출력
    }
}