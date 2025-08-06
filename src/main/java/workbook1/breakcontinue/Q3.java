package main.java.workbook1.breakcontinue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 음수가 나오면 break, 양수 평균 출력함
        int getNum = 0, sum = 0, number=0;
        while (true){
            getNum = sc.nextInt();
            if(getNum <= 0 ){
                break;
            }else {
                number++;
                sum+=getNum;
            }
        }
        if(number == 0){
            throw new ArithmeticException("0으로 나눔");
        }
        System.out.println((double) sum/number);
    }
}