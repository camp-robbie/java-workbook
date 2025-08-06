package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // 두 개의 값을 같이 출력합니다.
        // 괄호를 사용한 이유는 가독성에 있습니다.
        // 전위 증가/후위 증가는 단항 연산자로, 우선 순위가 높지만
        // 아래 메서드 사용의 흐름이 어떻게 진행되는지 더 잘 보여주기 위함입니다.
        System.out.println((++num)+" "+(num++));
    }
}
