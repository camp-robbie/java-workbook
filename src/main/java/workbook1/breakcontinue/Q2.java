package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 1~10 사이의 홀수만 출력하도록 continue 사용
        for (int i = 1; i <= 10; i++) { // 1~10까지 반복
            if (i % 2 == 0) { // 만약 짝수라면
                continue; // 건너뛰기
            }
            System.out.print(i + " "); // 홀수면 출력
        }
    }
}
