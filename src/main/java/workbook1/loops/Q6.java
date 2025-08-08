package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력
        // 2부터 9까지 구구단
        // 세로 형태로 출력

        /// 잘못된 출력 - 변수명이 문자열로 출력.
//        for (int i = 1; i < 10; i++) {
//            for(int j = 2; j < 10; j++) {
//                System.out.println(j + "*" + i + "=" + (j * i));
//            }
//            System.out.println(); // 한 행 끝나면 줄 바꿈
//        }
        // 출력에서 실제 곱셈 결과가 아니라 변수명 자체인 'j * i = 2' 문자열로 출력
        // System.out.println("j" + "*" + "i" + "=" + (j * i)); 이 부분을
        // System.out.println(j + "*" + i + "=" + (j * i)); 으로 수정하면 좋다.

        /// 올바른 출력 -- 단 기준으로 출력
        for (int x = 2; x <= 9; x++) { // 2부터 9까지의 구구단
            for (int y = 1; y <= 9; y++) { // 각 단에서 1 ~ 9 곱셈
                System.out.println(x + "x" + y + "=" + (x * y));
            }
            System.out.println(); // 단마다 줄바꿈
        }

        /// 올바른 출력 - 가로 본능으로 출력
        // printf를 사용해서 형식 정렬화.
        for (int a = 2; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                System.out.printf("%d x %d = %2d\t", a, b, a * b);
            }
            System.out.println();
        }
    }
}

/// printf("%d x %d = %2d\t", a, b, a * b);
/// %d    → 첫 번째 정수 (a) 출력
/// x     → 문자 'x' 그대로 출력
/// %d    → 두 번째 정수 (b 출력
/// =     → 등호 출력
/// %2d   → 세 번째 정수 (a * b)를 '폭 2칸'으로 출력 (한 자릿수는 앞에 공백)
/// \t    → 탭 간격으로 구분 (다음 단과 띄워쓰기 정렬)