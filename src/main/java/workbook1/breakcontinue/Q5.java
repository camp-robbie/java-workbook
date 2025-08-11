package main.java.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                // TODO: i + j == 6이면 위치 출력 후 라벨 break
                // 라벨을 사용한 break로 외부 루프까지 한 번에 종료
                // 인덱스는 1부터 시작한다고 가정
                if(i + j == 6) {    // i와 j를 더한 값이 6이라면
                    System.out.println("(" + i + "," + j + ")");    // 위치 출력
                    break outer;    // 외부루트까지 한 번에 종료함
                }
            }
        }
    }
}
