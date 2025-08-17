package main.java.workbook3.thissuper;

import java.util.Scanner;

class Box {
    int width, height, depth;
    Box() {
        // TODO: 매개변수 생성자 호출하여 1,1,1로 초기화
        this(1,1,1);                    // 생성자 안에서 다른 생성자 호출할 때 : this() 사용
    }
    Box(int w, int h, int d) {
        // TODO: 멤버 초기화
        width=w;
        height=h;
        depth=d;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int d = sc.nextInt();
        Box b1 = new Box();
        Box b2 = new Box(w, h, d);
        System.out.println(b1.width + " " + b1.height + " " + b1.depth);
        System.out.println(b2.width + " " + b2.height + " " + b2.depth);
    }
}