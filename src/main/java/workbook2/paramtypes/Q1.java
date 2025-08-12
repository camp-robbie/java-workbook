package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q1 {
    public static int primitiveParam(int x){
        // 메서드 안에서 x를 변경해야 합니다. (조건)
        x += 10;
        return x;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        // int 는 기본형 변수로, 객체의 주소가 아닌 값이 전달됩니다.
        // 따라서, 메서드에 전달한 파라미터(int x) 는 메모리 주소가 아닌,
        // int 형태의 값으로 전달됩니다. (호출한 곳에서의 변경이 없음.)
        int result = primitiveParam(x);

        // 만약 x가 int가 아닌 Integer 였다면, 15 15가 출력됩니다.
        System.out.println(x+" "+result);
    }
}