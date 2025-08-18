package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q3 {
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)
    public static int[] copyArray(int[] src) {
        int[] a = new int[src.length];                          // 배열 변수 a에 새로운 객체 생성(n길이)
        for (int i = 0; i < src.length; i++) {                  // 배열의 첫 요소부터 모든 요소를
            a[i] = src[i];                                      // a 배열에 복사 (깊은 복사)
        }
        return a;                                               // 배열 a 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                     // Scanner 생성
        int n = sc.nextInt();                                    // 공백/개행 전까지 정수 1개 입력 받음
        int[] original = new int[n];                             // 배열 변수 original에 새로운 객체 생성(n길이)
        for (int i = 0; i < n; i++) original[i] = sc.nextInt();  // 원본 배열 입력받기

        // TODO: copyArray 메서드 작성 후 주석 해제
        int[] copy = copyArray(original);                        // original을 매개변수로 갖는 copyArray 메서드를 copy에 저장
        // 원본 배열 변경
        for (int i = 0; i < n; i++) {                            // 원본 수정 배열 입력받기
            original[i] = sc.nextInt();
        }

        // TODO: copy 배열을 출력
        for (int i = 0; i < copy.length; i++) {                   // 모든 요소를
            System.out.print(copy[i] + " ");                      // 공백으로 구분하여 출력 -> 원본 배열값 출력됨
        }

        sc.close();                                               // 입력 닫기
    }
}

/*   Q. 얕은 복사(shallow copy)  vs  깊은 복사(deep copy)

         1. 얕은 복사(shallow copy)
              - 객체의 바깥 껍데기만 새로 만들고, 안쪽 필드(참조)는 그대로 공유
                  => 한쪽에서 내부 객체 변경 시 다른 쪽도 같이 변경됨

         2. 깊은 복사(deep copy)
              - 객체뿐만 아니라 그 객체가 들고 있는 가변 참조 필드들까지 재귀적으로 전부 새로 생성
                  => 서로 완전 독립!
 */

/*
Arrays.copyOf  /  System.arraycopy 정리 필요
 */