package main.java.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 5; i++) {                         // i : 행 (1~5)
            for (int j = 1; j <= 5; j++) {                     // i : 열 (1~5)
                // TODO: i + j == 6이면 위치 출력 후 라벨 break
                int sum = i + j;                               // 행 + 열 합계 계산

                if (sum == 6) {                                // 행과 열 합계가 6이면
                    System.out.println("("+i+","+j+")");       // 위치 출력 후
                    break outer;                               // 전체 반복문 종료!
                }
            }
        }
    }
}
