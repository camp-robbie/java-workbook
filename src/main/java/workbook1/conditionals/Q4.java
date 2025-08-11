package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("윤년인지 알아보고자 하는 연도를 입력하세요.");
        System.out.print("연도: ");
        int year = sc.nextInt();
        // TODO: 윤년 판별 로직 구현

        /// 윤년
        // 4의 배수이면서 100의 배수가 아닌 해
        // 또는 400의 배수인 해

        // 해당 연도를 4로 나눈 값이 0인 해 (4의 배수)
        // 400으로 나눈 값이 0인 해

        /// 평년
        // 100으로 나눈 값이 0인 해

        // 윤년 조건:
        // 1. 4의 배수이면서 100의 배수가 아닌 해 (year % 4 == 0 && year % 100 != 0)
        //    → 일반적인 윤년
        // 2. 또는 400의 배수인 해 (year % 400 == 0)
        //    → 예외적으로 100의 배수여도 윤년이 되는 경우
        //// → 윤년: 4의 배수이면서 100의 배수가 아니거나, 400의 배수인 해

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            // 연산자 우선순위에 따르면 &&가 1순위 , || 가 2순위 이다.
            // (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 에서 괄호를 써주면 보기 좋아진다.
            System.out.println(year + "년은 윤년");
        } else {
            System.out.println(year + "년은 평년");
        }
    }
}
