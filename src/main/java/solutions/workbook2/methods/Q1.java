package main.java.solutions.workbook2.methods;

import java.util.Scanner;

public class Q1 {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // sum 메서드를 호출하여 결과 출력
        int result = sum(a, b);
        System.out.println(result);

        sc.close();

    }
}

/*
1. **sum 메서드**:
    - `public static int sum(int x, int y)`: 두 개의 정수 매개변수를 받고 정수형을 반환
    - `static` 키워드: `main` 메서드에서 객체 생성 없이 직접 호출할 수 있도록 함
    - `return x + y`: 두 매개변수의 합을 반환

2. **main 메서드**:
    - `int a = sc.nextInt()`, `int b = sc.nextInt()`: 두 정수를 입력받음
    - `int result = sum(a, b)`: `sum` 메서드를 호출하여 결과를 `result` 변수에 저장
    - `System.out.println(result)`: 결과 출력

**메서드의 구조**:
- **메서드 선언**: `public static 반환타입 메서드명(매개변수)`
- **매개변수**: 메서드에 전달되는 값들 (`int x, int y`)
- **반환값**: `return` 키워드로 결과를 반환

예시 입력 `3 5`에 대해 `sum(3, 5)`가 호출되어 `8`이 반환되고 출력됩니다.
*/