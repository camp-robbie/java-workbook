package main.java.workbook2.returntype;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    /*
    static 으로 copyArray 메서드를 메모리에 올리고
    copy라는 original 배열과 크기가 같은 새로운 정수타입의 배열을 만든다.
    반복문을 활용하여 original 배열에 있는 값을 똑같이 저장
    return 복사본을 반환한다.
     */
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)
    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length]; // 배열의 크기를 original과 같게 생성
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i]; // original의 각 주소에 맞는 값을 copy에 똑같이 저장
        }
        return copy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] original = new int[n]; // 입력 받은 크기의 배열로 original 정수 배열 생성

            for (int i = 0; i < n; i++) original[i] = sc.nextInt(); // 반복문으로 original 배열로 입력 값 저장

            int[] copy = copyArray(original); // TODO: copyArray 메서드 작성 후 주석 해제

            // 원본 배열 변경
            for (int i = 0; i < n; i++) { // original 배열에 반복문으로 각 주소에 다른 값 입력 후 저장
                original[i] = sc.nextInt();
            }

            // TODO: copy 배열을 출력
            for (int i = 0; i < n; i++) { // 입력한 배열의 크기 만큼 반복하여 배열에 저장된 값을 불러온다.
                System.out.print(copy[i] + " ");
            }
        } catch (InputMismatchException e) { // 숫자 이외의 입력을 할 시
            System.out.println("숫자만을 입력해주세요"); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}