package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte b = sc.nextByte(); // 첫번째 입력 값
        short s = sc.nextShort(); // 두번째 입력 값
        int i = sc.nextInt(); // 세번째 입력 값
        long l = sc.nextLong(); // 네번째 입력 값

        long sum = b + s + i + l; // 연산 결과를 자동으로 long으로 형변환

        float result = (float) sum; // 연산 결과를 강제로 float로 형변환

        System.out.println(result); // 결과 출력
        sc.close();
    }
}
