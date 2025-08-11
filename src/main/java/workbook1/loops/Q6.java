package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                int mul = i * j;
                System.out.print(j + "*" + i + "=" + mul + "\t");
            }
            System.out.println();
        }

        /*
        // solution
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {  // 행을 담당  (곱해지는 수: 1~9)
                System.out.println(j + "*" + i + "=" + (j * i));    // 열을 담당 (단수: 2~9)

                if (j < 9) {    // 마지막 열이 아니면 공백 추가
                    System.out.print(" ");
                }
            }
            System.out.println();   // 한 행이 끝나면 줄바꿈
        }
        */
    }
}