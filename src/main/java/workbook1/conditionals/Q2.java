package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        // switch 와 람다식을 이용해 출력합니다.
        // 람다식을 활용할 경우, break를 사용하지 않아도 됩니다.
        // case를 사용하여 특정 값(1~7) 일 경우 요일을 출력하고,
        // default를 사용하여 특정 값이 아닐 경우 잘못된 입력을 출력합니다.
        switch (day){
            case 1 -> System.out.println("월");
            case 2 -> System.out.println("화");
            case 3 -> System.out.println("수");
            case 4 -> System.out.println("목");
            case 5 -> System.out.println("금");
            case 6 -> System.out.println("토");
            case 7 -> System.out.println("일");
            default -> System.out.println("잘못된 입력");
        }
    }
}
