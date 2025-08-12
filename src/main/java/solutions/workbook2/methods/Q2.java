package main.java.solutions.workbook2.methods;

import java.util.Scanner;

public class Q2 {

    public static int stringLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // stringLength 호출 후 결과 출력
        int length = stringLength(str);
        System.out.println(length);

        sc.close();

    }
}

/*
1. **stringLength 메서드**:
    - `public static int stringLength(String str)`: 문자열을 매개변수로 받고 정수형을 반환
    - `return str.length()`: 문자열의 `length()` 메서드를 사용하여 문자열 길이를 반환
    - `static` 키워드: `main` 메서드에서 객체 생성 없이 직접 호출 가능

2. **main 메서드**:
    - `String str = sc.nextLine()`: 문자열을 입력받음 (`nextLine()`은 공백 포함된 문자열도 입력받을 수 있음)
    - `int length = stringLength(str)`: `stringLength` 메서드를 호출하여 결과를 `length` 변수에 저장
    - `System.out.println(length)`: 문자열의 길이를 출력

**메서드의 특징**:
- **매개변수**: `String str` - 길이를 측정할 문자열
- **반환타입**: `int` - 문자열의 길이 (정수)
- **기능**: 자바의 내장 메서드 `length()`를 활용하여 문자열 길이 계산

예시 입력 `Hello`에 대해 `stringLength("Hello")`가 호출되어 `5`가 반환되고 출력됩니다.

*/