package main.java.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                // TODO: i + j == 6이면 위치 출력 후 라벨 break\\

                // 행 + 열의 합이 6인 경우
                if (i + j == 6) {
                    System.out.println("(" + i + "," + j + ")");

                    // 안쪽 반복문뿐, outer 바깥 반복문까지 종료
                    break outer;
                }
            }
        }
    }
}