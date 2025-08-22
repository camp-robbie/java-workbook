package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        // 합을 출력
        //1부터 100까지의 정수 중에서 10의 배수가 나오면 반복을 종료하고, 그 이전까지의 합을 출력하는 프로그램을 작성하시오.

        // 1. 1부터 100까지의 정수를 반복하는 반복문 작성
        // 2. 조건문을 통해서 그 숫자 중 10의 배수가 있는지 확인
        // 3. break 사용해서 10의 배수가 나오면 반복문을 건너뛴다
        // 4. 이때까지 더한 합을 출력한다.

        for (int i = 1; i <= 100; i ++) {
            if (i % 10 == 0) {
                break;   // if문을 종료하는게 아니라 반복문을 종료한다!
            }
            sum += i;
        }
        System.out.println(sum);
    }
}