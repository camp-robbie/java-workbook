package main.java.workbook1.conditionals;

import java.util.Scanner;
// 연도를 입력받아 윤년(leap year)인지 여부를 출력하는 프로그램을 작성하시오.
// 윤년은 연도가 4의 배수이면서 100의 배수가 아니거나     400의 배수인 해이다. 함
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // TODO: 윤년 판별 로직 구현
        if( (year % 4 == 0) && (year % 100 != 0) ||  year % 400 == 0 ){
            System.out.println(year);
        }else {
            System.out.println("no");
        }
    }
}
