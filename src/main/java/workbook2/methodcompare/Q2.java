package main.java.workbook2.methodcompare;

import java.util.Scanner;

class MathUtil {

    // 제곱을 return 하는 클래스 메서드 square 입니다.
    static int square(int n) {
        // Math.pow() 는 double 값을 return 하기에,
        // int로 강제 형변환 해줍니다.
        return (int) Math.pow(n,2);
    }
    // 세제곱을 return 하는 인스턴스 메서드 cube 입니다.
    int cube(int n) {
        return (int) Math.pow(n,3);
    }
}

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // square() 은 클래스 메서드이기 때문에, 객체 생성 없이 사용할 수 있습니다.
        int sq = MathUtil.square(n);

        // cube() 를 사용하기 위해 객체를 생성합니다.
        MathUtil util = new MathUtil();
        int cu = util.cube(n);

        // 출력합니다.
        System.out.println(sq + " " + cu);
    }
}
