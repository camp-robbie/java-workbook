package main.java.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {
        outer:          // 라벨 선언, 반복문 바깥에 이름을 붙인다.. 이 때의 라벨이름은 'outer'
        for (int i = 1; i <= 5; i++) {      // 배열 인덱스는 0부터 시작히자만,
            for (int j = 1; j <= 5; j++) {      // 여기서는 1부터 5까지 반복되는 인덱스. (행, 열)
                // TODO: i + j == 6이면 위치 출력 후 라벨 break

                // 행, 열의 합이 6인 지점에서 위치 출력
                if (i + j == 6) {
                    System.out.println("(" + i + "," + j + ")");
                    break outer; // break '라벨이름' 이 때는 break outer 이 붙은 바깥 for문 까지 종료
                }
            }
        }
    }
}
