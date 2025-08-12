package main.java.workbook2.returntype;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    // 조건
    // 메서드는 배열을 깊은 복사(deep copy) 하여 반환합니다.
    // 원본 배열 값 변경 후 복사본을 출력합니다.
    public static int[] copyArray(int[] arr) {
        // 배열의 깊은 복사에는 여러가지 방법이 있습니다.
        /*
        // 1. .clone() 사용
        int[] copyArr = arr.clone();

        // 2. Arrays.copyOf([array name], [array.length]) 사용
        // 배열의 처음~마지막 까지의 길이를 복사합니다.
        int[] copyArr2 = Arrays.copyOf(arr, arr.length);

        // 3. Arrays.copyOfRange([array name], [start index], [end index])
        // 배열의 원하는 인덱스 범위만큼 복사가 가능합니다.
        int[] copyArr3 = Arrays.copyOfRange(arr, 0, arr.length-1);

        // 4. System.arraycopy([source array name], [source start index], [destination array name], [destination start index], [source.length])
        // destination array의 선언과 초기화가 필요합니다.
        int[] copyArr4 = new int[arr.length];
        System.arraycopy(arr,0, copyArr4, 0,  arr.length);

        // 5. 원시적인 방법 (for문 이용)
        // destination의 선언과 초기화가 필요합니다.
        int[] copyArr5 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr5[i] = arr[i];
        }
         */
        return arr.clone();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] original = new int[n];

        for (int i = 0; i < n; i++) original[i] = sc.nextInt();

        int[] copy = copyArray(original);

        // 원본 배열을 수정합니다.
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        // 향상된 for 문을 사용하여 출력합니다.
        for (int i : copy){
            System.out.print(i+" ");
        }
    }
}