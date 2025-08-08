package main.java.workbook1.primitiveconversion;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // TODO: b, s, i, l을 long으로 변환해 합산 후 float으로 변환하여 출력
        // Scanner 객체를 통해서 사용자 입력을 받는다.
        Scanner sc = new Scanner(System.in);

        //1. 사용자로부터 네 가지 타입의 숫자를 입력받는다
        System.out.print("byte 숫자를 입력해주세요: ");
        byte b = sc.nextByte();
        System.out.print("short 숫자를 입력해주세요: ");
        short s = sc.nextShort();
        System.out.print("int 숫자를 입력해주세요: ");
        int i = sc.nextInt();
        System.out.print("long 숫자를 입력해주세요: ");
        long l = sc.nextLong();

        //2. 작은 타입에서 큰 타입으로 변환시켜서 합산해준다
        long sum = b + s + i + l;
        // 자동 형변환을 통해서 모든 값을 long 타입으로 환산
        // long이 가장 큰 타입이므로, 작은 타입에서 큰 타입으로는 자바에서 자동으로 처리
        // b, s, i 는 long 으로 자동 형변환되어 기존 l 과 합산됨.

        //3. 합산 결과를 실수형으로, float 타입으로 변환해준다.
        float sumf = (float) sum;

        //4. 결과 출력
        System.out.println("결과 : " + sumf);

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 사고흐름
//1. 사용자로부터 네 가지 타입의 숫자를 입력받는다
//2. 작은 타입에서 큰 타입으로 변환시켜서 합산해준다
//3. 합산 결과를 실수형으로, float 타입으로 변환해준다.
//4. 결과 출력