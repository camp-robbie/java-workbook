package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int number = 0;

        while (true){

            int num = sc.nextInt();
            if (num < 0){
                break;
            }

            number = number + num;
            count = count + 1;

        }
        System.out.println(number / count);
        // TODO: 음수가 나오면 break, 양수 평균 출력
    }
}