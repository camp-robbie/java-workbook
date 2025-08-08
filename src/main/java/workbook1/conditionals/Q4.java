package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        // year 가 4의 배수라면(4로 나누었을 때 나머지 없음) 아래의 구문 실행
        if (year % 4 == 0){
            // year가 100의 배수가 아니거나, 400의 배수일 때
            // or 연산자를 사용한 이유 -> 둘 중 하나만 만족하여도 윤년이기 때문
            if (year % 100 != 0 || year % 400 == 0){
                System.out.println("윤년");
            }
        }

        /*
        // 한 줄에 끝내는 법
        // 필수 구문(4의 배수일 것)은 AND로, 둘 중 하나만 충족되어도 되는 것은
        // OR 연산자를 사용하였습니다.
        // 4의 배수이며 100의 배수가 아니거나 400의 배수인 값이면 참인 구문입니다.
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("윤년");
        }
        */
    }
}
