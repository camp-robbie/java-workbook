package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 구구단 전체를 출력

        for (int i = 1; i < 10; i++) {
            for(int j = 2; j < 10; j++) {
                System.out.println("j" + "*" + "i" + "=" + (j*i));
            }
            System.out.println(); // 한 행 끝나면 줄 바꿈
        }
    }
}