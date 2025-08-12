package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q2 {
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)
    public static void addHundred(int[] arr) {         // addHundred 메서드 생성 (매개변수= int[] arr)
        arr[0] += 100;                                 // arr 첫 요소에 100을 더해 arr[0] 수정
    }                                                  // n == 0 예외처리  -> if(arr.length==0) return; 추가해주면 됨

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);           // scanner 생성
        int n = sc.nextInt();                          // 변수 n에 '정수' 입력받기 (공백/개행 무시)
        int[] arr = new int[n];                        // n개의 정수 배열을 갖는 arr 객체 생성
        for (int i = 0; i < n; i++) {                  // arr 배열 전체의 각 요소에
            arr[i] = sc.nextInt();                     // 값을 입력받음
        }
        // TODO: addHundred 메서드 작성 후 주석 해제
        addHundred(arr);                               // addHundred 메서드 호출 -> arr[0] 수정 (100 더한 값으로)

        // TODO: 변경된 arr 출력
        for (int i = 0; i < n; i++) {                  // arr 배열 전체 요소 값을
            System.out.print(arr[i]);                  // 하나씩 출력
            if(i < n-1){
                System.out.print(" ");                 // 마지막 요소 출력 전까지 공백으로 구분하여 출력
            }
        }
        sc.close();                                    // 입력 닫기
    }
}