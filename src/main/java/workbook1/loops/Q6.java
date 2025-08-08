package main.java.workbook1.loops;

public class Q6 {
    public static void main(String[] args) {
        int num1;
        int num2;

        for(num1 = 1; num1 <= 9; num1++){
            for (num2 = 2; num2 <= 9; num2++){
                System.out.print(num2 + "*" +num1 + "=" + num1 * num2 + " ");
            }
            System.out.println();
        }
        // TODO: 구구단 전체를 출력
    }
}