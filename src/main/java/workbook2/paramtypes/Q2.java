package main.java.workbook2.paramtypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)
    /*
    static을 사용하여 addHundred 메서드를 메모리에 올린다.
    int[0] arr의 첫 요소에 100을 더한다.
    결과 값을 return 한다.
     */
    public static int addHundred(int[] arr) {
        arr[0] += 100;
        return arr[0];
    }

    /*
    Scanner로 n 입력 값을 받는다.
    입력 받은 n의 값을 arr 배열의 크기로 고정한다.
    반복문을 활용해 arr 배열의 크기만큼 입력을 받고 arr에 순차적으로 저장한다.
    addHundred 메서드를 호출하여 arr 배열을 입력 값으로 넣어준다.
    메서드에 입력된 addHundred는 첫번째 주소 0의 값만 arr[0]+100을 더한 값으로 return 된다.
    반복문을 활용해 arr 배열 전체를 출력한다.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            addHundred(arr); // TODO: addHundred 메서드 작성 후 주석 해제

            // TODO: 변경된 arr 출력
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (InputMismatchException e) { // 숫자 이외의 입력을 받을 시
            System.out.println("숫자만을 입력해주세요."); // 예외 처리
        } finally {
            sc.close(); // 자원 누수 방지
        }
    }
}