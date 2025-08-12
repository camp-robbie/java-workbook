package main.java.workbook2.paramtypes;

import java.util.Scanner;

class Pair {

    // 두 개의 정수를 필드로 가지고 있는 클래스, 그리고 생성자입니다.
    int a;
    int b;
    Pair(int a, int b) { this.a = a; this.b = b; }
}

public class Q5 {
    public static void swapPair(Pair pair) {
        // temp를 이용해 값을 일시적으로 저장하고,
        // 두 개의 값을 바꿉니다.
        int temp = pair.a;
        pair.a = pair.b;
        pair.b = temp;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        Pair pair = new Pair(x, y);

        // 메서드를 호출합니다.
        swapPair(pair);

        // 출력합니다.
        System.out.println(pair.a+" "+pair.b);
    }
}