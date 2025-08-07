package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0; // 값을 담을 변수

        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        for (int i = 1; i <= 100; i++) { // 100까지 반복
            if (i % 10 == 0) { // 10의 배수 일 때
                break; // 반복문 탈출
            }
            sum += i; // sum = sum + i;
        }
        System.out.println(sum); // 결과 값 출력
    }
}