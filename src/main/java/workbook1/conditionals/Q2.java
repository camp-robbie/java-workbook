package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: switch 문을 이용하여 요일 출력
        System.out.println("간편 요일 작성기입니다");
        System.out.println("1(월), 2(화), 3(수), 4(목), 5(금), 6(토), 7(일)");
        System.out.print("희망하는 숫자를 적어주세요: ");
        int day = sc.nextInt();

        /// 추가로 공부해볼 것
        /// 검색해보니 HashMap, enum, List, Stream 방법으로도 해결할 수 있다고 한다.

        // 입력된 숫자에 따라 요일을 출력하는 switch 문 활용
        switch (day) {
            case 1:     //
                System.out.println("월");
                break;
            case 2:
                System.out.println("화");
                break;
            case 3:
                System.out.println("수");
                break;
            case 4:
                System.out.println("목");
                break;
            case 5:
                System.out.println("금");
                break;
            case 6:
                System.out.println("토");
                break;
            case 7:
                System.out.println("일");
            default:   // 1~7 이외의 숫자 예외 처리
                System.out.println("1~7까지의 정수를 입력해주세요");
        }
    sc.close(); // sc 객체 종료
    }
}
