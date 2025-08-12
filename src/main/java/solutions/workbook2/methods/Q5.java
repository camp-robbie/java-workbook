package main.java.solutions.workbook2.methods;

import java.util.Scanner;

public class Q5 {

    public static String[] reverseStrings(String[] words) {
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String reversed = "";
            // 각 문자열을 거꾸로 만들기
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversed += words[i].charAt(j);
            }
            result[i] = reversed;
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // reverseStrings 호출 후 결과 출력
        String[] result = reverseStrings(words);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {  // 마지막 요소가 아니면 공백 추가
                System.out.print(" ");
            }
        }

        sc.close();

    }
}

/*
1. **reverseStrings 메서드**:
    - `public static String[] reverseStrings(String[] words)`: 문자열 배열을 매개변수로 받고 문자열 배열을 반환
    - `String[] result = new String[words.length]`: 결과를 저장할 새로운 배열 생성
    - **외부 반복문**: 배열의 각 문자열을 순회
    - **내부 반복문**: 각 문자열을 거꾸로 만들기
        - `for (int j = words[i].length() - 1; j >= 0; j--)`: 문자열의 마지막 문자부터 첫 번째 문자까지 역순으로 접근
        - `words[i].charAt(j)`: 해당 위치의 문자를 가져옴
        - `reversed += words[i].charAt(j)`: 역순으로 문자를 연결하여 새 문자열 생성

2. **main 메서드**:
    - 문자열 개수 `n`을 입력받고 `String` 배열 생성
    - `n`개의 문자열을 입력받아 배열에 저장
    - `reverseStrings` 메서드를 호출하여 결과 배열을 받음
    - 결과 배열의 모든 요소를 공백으로 구분하여 출력

**문자열 역순 변환 과정** (예시: "apple"):
- `j = 4`: 'e' → reversed = "e"
- `j = 3`: 'l' → reversed = "el"
- `j = 2`: 'p' → reversed = "elp"
- `j = 1`: 'p' → reversed = "elpp"
- `j = 0`: 'a' → reversed = "elppa"

예시 입력에 대해 "apple" → "elppa", "banana" → "ananab", "cherry" → "yrrehc"로 변환되어 `elppa ananab yrrehc`가 출력됩니다.

 */