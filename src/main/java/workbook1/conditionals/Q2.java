package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        // TODO: switch 문을 이용하여 요일 출력
        switch (day) {
            case 1:
                System.out.println("월"); // 1 입력 시 "월" 출력 후 switch문 빠져나옴(break)
                break;

            case 2:
                System.out.println("화"); // 2 입력 시 "화" 출력 후 switch문 빠져나옴(break)
                break;

            case 3:
                System.out.println("수"); // 3 입력 시 "수" 출력 후 switch문 빠져나옴(break)
                break;

            case 4:
                System.out.println("목"); // 4 입력 시 "목" 출력 후 switch문 빠져나옴(break)
                break;

            case 5:
                System.out.println("금"); // 5 입력 시 "금" 출력 후 switch문 빠져나옴(break)
                break;

            case 6:
                System.out.println("토"); // 6 입력 시 "토" 출력 후 switch문 빠져나옴(break)
                break;

            case 7:
                System.out.println("일"); // 7 입력 시 "일" 출력 후 switch문 빠져나옴(break)
                break;

            default:
                System.out.println("잘못된 입력"); // 범위 벗어난 입력은 "잘못된 입력" 출력
                                                 // swich문 마지막 조건이라 break 없어도 빠져나옴

        }
    }
}
