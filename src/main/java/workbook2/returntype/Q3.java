package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q3 {       // 배열 깊은 복사(deep copy) 반환
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)

    /**
     * copyArray: 전달받은 배열(int[])의 '깊은 복사본'을 만들어 반환한다.
     * - 얕은 복사(shallow copy): 같은 배열을 가리키는 참조만 복사 (원본 변경 시 복사본도 영향)
     * - 깊은 복사(deep copy): 새로운 배열을 만들고, 요소 값을 하나씩 복사 (원본 변경 영향 없음)
     */

    public static int[] copyArray(int[] source) {
        int[] dest = new int[source.length];   // 새 배열 생성 (다른 주소)
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];               // 값만 복사
        }
        return dest; // 참조형 반환: 새로 만든 배열 객체의 '주소'를 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();           // 예: 3
        int[] original = new int[n];
        for (int i = 0; i < n; i++)
            original[i] = sc.nextInt();     // 예: 1 2 3

        // 깊은 복사본을 만든다.
        int[] copy = copyArray(original); // TODO: copyArray 메서드 작성 후 주석 해제

        /// 원본 배열 변경
        // 원본 배열을 '다른 값'으로 덮어써서 변경해 본다.
        // 이 변경이 copy에는 영향이 없어야 한다.
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();     // 예: 4 5 6
        }
        // TODO: copy 배열을 출력

        // 복사본 출력: 1 2 3
        for (int i = 0; i < copy.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(copy[i]);
        }
        System.out.println();

        sc.close();
    }
}