package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1~7중에 숫자를 입력하세요. 해당 숫자에 맞는 요일을 출력합니다.");
        int day = sc.nextInt();
        // TODO: switch 문을 이용하여 요일 출력

        switch (day) {
            case 1:
                System.out.println("월요일입니다. 입력하신 숫자 : "+day);
                break;
            case 2:
                System.out.println("화요일입니다. 입력하신 숫자 : "+day);
                break;
            case 3:
                System.out.println("수요일입니다. 입력하신 숫자 : "+day);
                break;
            case 4:
                System.out.println("목요일입니다. 입력하신 숫자 : "+day);
                break;
            case 5:
                System.out.println("금요일입니다. 입력하신 숫자 : "+day);
                break;
            case 6:
                System.out.println("토요일입니다. 입력하신 숫자 : "+day);
                break;
            case 7:
                System.out.println("일요일입니다. 입력하신 숫자 : "+day);
                break;
            default:
                System.out.println("[잘못된입력] 1~7까지중에 입력하세요 휴먼");
        }
    }
}
