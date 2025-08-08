package main.java.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {
        outer: // 라벨
        //  5×5 정사각형 구역에서 행과 열을 중첩 반복문으로 탐색
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                // TODO: i + j == 6이면 위치 출력 후 라벨 break
                // 5×5 정사각형 구역에서 행과 열을 중첩 반복문으로 탐색하다가 첫 번째로 행+열의 합이 6인 지점을 찾으면 위치를 출력하고 전체 탐색을 종료하는 프로그램을 작성하시오.
                // 라벨을 사용한 break로 외부 루프까지 한 번에 종료합니다.
                // 인덱스는 1부터 시작한다고 가정합니다.
                // 라벨 : 반복문 앞에 붙이는 식별자(identifier), 반복문 앞에 선언하며, 콜론 :으로 끝남

                if (i + j == 6) { // 행+열의 합이 6인 지점
                    System.out.println("(" + i + "," + j + ")"); // 위치를 출력
                    break outer; // 전체 탐색을 종료
                }
            }
        }
    }
}
