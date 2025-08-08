package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {

        // TODO: 구구단 출력 중 결과가 30 이상이면 continue
        for (int i = 2; i < 10; i++) { // 2~9단 (열)
            for (int j = 1; j < 10; j++) { // 1~9까지 (행)
                if (i * j >= 30) { // 두 수의 곱이 30 이상일 경우
                    continue; // 건너뛰기
                }
                System.out.print(i + "*" + j + "=" + (i * j) + " "); // 출력 예시에 맞게 출력
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
