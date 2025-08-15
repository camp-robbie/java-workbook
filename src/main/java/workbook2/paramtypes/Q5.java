package main.java.workbook2.paramtypes;

import java.util.Scanner;

class Pair {
    int a;
    int b;
    Pair(int a, int b) { this.a = a; this.b = b; }
}

public class Q5 {               // Pair 객체 내부 값 swap
    // TODO: swapPair 메서드 작성 (Pair 객체의 a와 b 값을 교환)

    /**
     * Pair '참조'를 통해 같은 객체를 가리키므로,
     * 그 내부 필드 a, b를 교환하면 호출한 곳에서도 바뀐 값이 보입니다.
     */

    public static void swapPair(Pair pair) {
        if (pair != null) {
            int tmp = pair.a;
            pair.a = pair.b;
            pair.b = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();       // 입력: 5
        int y = sc.nextInt();       // 입력: 10

        Pair pair = new Pair(x, y);

        swapPair(pair); // TODO: swapPair 메서드 작성 후 주석 해제
        // TODO: pair.a와 pair.b 출력

        // 출력: "10 5"
        System.out.println(pair.a + " " + pair.b);

        sc.close();
    }
}