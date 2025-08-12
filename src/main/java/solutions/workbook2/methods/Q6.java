package main.java.solutions.workbook2.methods;

import java.util.Scanner;

public class Q6 {

    public static int factorial(int n) {
        // 기저 조건: n이 1 이하이면 1을 반환
        if (n <= 1) {
            return 1;
        }
        // 재귀 호출: n * factorial(n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // factorial 호출 후 결과 출력
        int result = factorial(n);
        System.out.println(result);

        sc.close();
    }
}

/*
1. **factorial 메서드**:
    - `public static int factorial(int n)`: 정수를 매개변수로 받고 정수를 반환
    - **기저 조건(Base Case)**: `if (n <= 1) return 1`
        - 재귀 호출을 멈추는 조건
        - n이 1 이하이면 1을 반환하여 재귀를 종료

    - **재귀 호출(Recursive Case)**: `return n * factorial(n - 1)`
        - 현재 값 n에 factorial(n-1)의 결과를 곱함
        - 메서드가 자기 자신을 더 작은 값으로 호출

2. **재귀 동작 과정** (예시: factorial(5)):
```
   factorial(5) = 5 * factorial(4)
                = 5 * 4 * factorial(3)
                = 5 * 4 * 3 * factorial(2)
                = 5 * 4 * 3 * 2 * factorial(1)
                = 5 * 4 * 3 * 2 * 1
                = 120
```
1. **재귀의 핵심 요소**:
    - **기저 조건**: 재귀 호출을 멈추는 조건 (무한 루프 방지)
    - **재귀 관계**: 문제를 더 작은 동일한 문제로 분해
    - **수렴성**: 매번 호출할 때마다 기저 조건에 가까워짐

**팩토리얼 정의**:
- 0! = 1, 1! = 1
- n! = n × (n-1) × (n-2) × ... × 2 × 1

예시 입력 `5`에 대해 `factorial(5)`가 호출되어 `5! = 120`이 출력됩니다.

 */