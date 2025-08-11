package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        // TODO: switch 문을 이용하여 요일 출력

        //switch문을 사용하여 1~7에 월~일을 대응
        switch (day) {
            case 1:
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
                break;
            //잘못된 입력의 경우 문구 출력
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        sc.close();
    }
}
