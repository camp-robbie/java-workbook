package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력
        // i는 열의 값 j는 행의 값 그러니 조건의 맞게 하기 위해서 출력부분을 수정할 필요가 있음.
        for (int i = 1; i < 10; i++) { // 1부터 9까지 열을 생성
            for (int j = 2; j < 10; j++) { // 2부터 9까지 행을 생성
                System.out.print(j + "*" + i + "=" + i * j + " "); // 출력 예시와 같게 출력문 수정
            }
            System.out.println(); // 줄 바꿈
        }
    }
}