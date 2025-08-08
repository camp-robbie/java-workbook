package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue

        for (int i = 2; i <= 9; i++) {                 // 2단 ~ 9단까지 반복
            for (int j = 1; j <= 9; j++) {             // 각 단에서 1 ~ 9 까지 곱하기
                int mul = i * j;                       // 곱셈 결과 계산

                if (mul >= 30) {                       // 곱셈 결과가 30 이상이면
                    continue;                          // 출력하지 않고 다음 j로 진행
                }

                System.out.print(i+"*"+j+"="+mul+" "); // 30 미만 결과만 출력(구구단 형식)
            }
            System.out.println();                      // 한 단 출력 후 줄바꿈
        }
    }
}
