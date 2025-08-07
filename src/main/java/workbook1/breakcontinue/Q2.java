package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 1~10 사이의 홀수만 출력하도록 continue 사용
        // for 문과 continue를 사용하여 짝수는 건너뜀
        for(int i = 1; i <= 10; i++) {  // i는 1이고, i가 10보다 작거나 같을 동안 i를 1씩 증가시키며 반복 수행
            if(i % 2 == 0) {            // i를 2로 나눈 나머지가 0이라면 (짝수라면)
                continue;               // 다음 반복으로 넘어감
            }
            System.out.print(i + " ");  // i를 출력함
        }
    }
}
