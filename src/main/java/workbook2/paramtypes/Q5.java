package main.java.workbook2.paramtypes;

import java.util.Scanner;

class Pair {
    int a;
    int b;
    Pair(int a, int b) { this.a = a; this.b = b; }
}

public class Q5 {
    // TODO: swapPair 메서드 작성 (Pair 객체의 a와 b 값을 교환)
    public static void swapPair(Pair pair) {    // swapPair 메서드 (매개변수: Pair pair)
        int temp = pair.a;                              // temp에 pair.a 값을 저장함
        pair.a = pair.b;                                // pair.a에 pair.b 값을 저장함
        pair.b = temp;                                  // pair.b에 temp 값을 저장함
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Pair pair = new Pair(x, y);
        swapPair(pair); // TODO: swapPair 메서드 작성 후 주석 해제
        // TODO: pair.a와 pair.b 출력
        System.out.println(pair.a + " " + pair.b);  // 결과를 출력함
    }
}