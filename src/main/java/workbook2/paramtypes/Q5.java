package main.java.workbook2.paramtypes;

import java.util.InputMismatchException;
import java.util.Scanner;

// Pair 클래스에 두 개의 정수(a,b)를 필드로 선언
class Pair {
    int a;
    int b;

    Pair(int a, int b) { // Pair 생성자
        this.a = a;
        this.b = b;
    }
}

public class Q5 {
    // TODO: swapPair 메서드 작성 (Pair 객체의 a와 b 값을 교환)
    /*
    static으로 swapPair 메서드를 메모리에 올리고 Pair를 입력 값으로 받는다.
    메서드 내부에 임시변수 하나를 생성하여 a와 b의 값을 변환할 때 활용한다.
     */
    public static void swapPair(Pair pair) {
        int temp = pair.a;
        pair.a = pair.b;
        pair.b = temp;
    }

    /*
    Scanner를 활용하여 x,y에 입력 값을 저장, Pair 클래스의 객체를 생성하여 (x,y)저장,
    swapPair 메서드를 호출하여 pair를 입력 값으로 전달,
    swapPair 메서드 내부에서 x,y값의 순서가 바뀜.
    잘 저장되었는지 pair의 x,y를 출력한다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            Pair pair = new Pair(x, y);

            swapPair(pair); // TODO: swapPair 메서드 작성 후 주석 해제

            // TODO: pair.a와 pair.b 출력
            System.out.println(pair.a + " " + pair.b);
        } catch (InputMismatchException e) { // 숫자 이외의 입력을 받을 시
            System.out.println("숫자만을 입력해주세요."); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}