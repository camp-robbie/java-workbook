package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // TODO: 전위 증가와 후위 증가 결과 출력

        System.out.println("숫자를 입력해주세요 = " + num);

        //전위 증가
        System.out.println("전위 증가 = " + (++num)); // numb 을 1증가 시키고, 출력.  
        System.out.println("전위 증가 후 값: " + num); // 전위 증가된 값 출력

        //후위 증가
        System.out.println("전위 증가 = " + (num++)); // 현재 값을 먼저 출력시키고, 그 다음에 1 증가.
        System.out.println("후위 증가 후 값: " + num); // 증가된 값 출력
    }
}
