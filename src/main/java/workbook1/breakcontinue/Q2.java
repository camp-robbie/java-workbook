package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 1~10 사이의 홀수만 출력하도록 continue 사용
        // 1부터 10까지의 정수 중에서 짝수를 건너뛰고 홀수만 출력하는 프로그램을 작성하시오.
        // for 문과 continue를 사용하여 짝수는 건너뜁니다.

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // 짝수
                continue; // 건너뛰기
            }
            System.out.print(i + " "); // 홀수만 출력
        }
    }
}
