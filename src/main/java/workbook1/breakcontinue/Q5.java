package main.java.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                // TODO: i + j == 6이면 위치 출력 후 라벨 break
                if (i + j == 6) {
                    System.out.println("(" + i + "," + j + ")");
                    break outer;
                }
            }
        }

        /*
        // solution
        // 라벨 : outer로 외부 반복문에 라벨 지정
        // 일반적인 break는 가장 가까운 반복문(내부 반복문)만 종료
        // 라벨을 사용한 break outer;은 outer 라벨이 붙은 외부 반복문까지 한 번에 종료
        */
    }
}
