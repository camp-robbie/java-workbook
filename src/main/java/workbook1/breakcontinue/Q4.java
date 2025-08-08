package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue
        // 2~9단 구구단에서 곱셈 결과가 30 이상이면 결과를 출력하지 않고 그 단의 다음 수로 넘어가는 프로그램을 작성하시오.
        // 중첩 for 문에서 continue를 사용하여 30 이상인 경우 출력하지 않습니다.

        for (int dan = 2; dan <= 9; dan++ ) {
            System.out.println(dan);

            for (int i = 1; i <= 9; i++) {
                int result = dan * i;

                if (result >= 30) { // 결과가 30 이상
                    continue; // 건너뛰기
                }
                System.out.println(dan + "x" + i + "=" + result); // 출력
            }
            System.out.println();
        }
    }
}
