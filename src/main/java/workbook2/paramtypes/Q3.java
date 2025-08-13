package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {

    // 배열이 아닐 경우
    /*
    static을 사용하여 swapBasics를 메모리에 올리고 두 개의 문자열을 입력 값으로 받는다.
    임시 변수 temporary에 str1의 입력 값을 temporary 값으로 선언
    각각의 입력 값의 변환을 시도
    하지만 변환하지 못했다..
    */
    public static void swapBasics(String str1, String str2) {
        String temporary = str1;
        str1 = str2;
        str2 = temporary;
    }

    // TODO: swapStrings 메서드 작성 (배열을 받아 두 문자열을 교환)
    /*
    static을 사용하여 swapStrings를 메모리에 올리고 문자열을 입력 값으로 받는다.
    임시 변수 temporary를 입력 받은 배열의 첫번째 주소의 값으로 선언한다.
    첫번째 문자열에 두번째 문자열의 값을 덮는다.
    두번째 문자열엔 temporary의 값을 덮어 두 값을 변경해준다.
    메서드의 타입이 void 그러니 return 값이 없다.
     */
    public static void swapStrings(String[] str) {
        String temporary = str[0];
        str[0] = str[1];
        str[1] = temporary;
    }

    /*
    Scanner로 n 입력 값을 받는다.
    입력 받은 s1, s2를 arr 배열에 저장한다.
    swapStrings 메서드를 호출 후 메서드에 arr 배열을 입력 값으로 주입
    메서드를 활용하여 두 문자열을 교환해준다.
    반복문을 활용하여 전체 문자열을 출력해준다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s1 = sc.next();
            String s2 = sc.next();
            String[] arr = {s1, s2};

            swapBasics(s1, s2); // 기본형 매개 변수 사용

            swapStrings(arr); // TODO: swapStrings 메서드 작성 후 주석 해제

            // 기본형으로 교환 했을 경우
            System.out.println("기본형 매개변수의 교환");
            System.out.println(s1 + " " + s2);

            // TODO: arr[0], arr[1] 출력
            // 배열로 교환 했을 경우
            System.out.println("배열의 교환");
            for (int i = 0; i < arr.length; i++) { // 문자열의 크기만큼 반복
                System.out.print(arr[i] + " ");
            }
        } finally {
            sc.close(); // 자원 누수 방지
        }
    }
}
