package main.java.workbook1.breakcontinue;

public class Q5 {
    public static void main(String[] args) {
//        outer:
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                // TODO: i + j == 6이면 위치 출력 후 라벨 break
//            }
//        }

        // 문제 조차 이해가 가지 않습니다,,, 지피티 답을 배껴왔어도 이해 불가입니다ㅠ ㅠ

        outer: // 바깥 반복문 라벨
        for (int i = 1; i <= 5; i++) {        // 행 반복
            for (int j = 1; j <= 5; j++) {    // 열 반복
                if (i + j == 6) {             // 행 + 열이 6이면
                    System.out.println("(" + i + "," + j + ")");
                    break outer;              // 바깥 for문까지 완전히 종료
                }
            }
        }
    }

}
