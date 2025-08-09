package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 1~10 사이의 홀수만 출력하도록 continue 사용

        // 첫 번째 시도 - 홀수만 출력하는건 성공했지만 continue를 사용하지 않았다
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }

        // 두 번째 시도 - 성공!
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
