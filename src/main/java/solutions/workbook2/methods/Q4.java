package main.java.solutions.workbook2.methods;

import java.util.Scanner;

public class Q4 {

    public static double average(int a, int b, int c) {
        return (double)(a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // average 호출 후 결과 출력
        double result = average(a, b, c);
        System.out.println(result);

        sc.close();

    }
}

/*
1. **average 메서드**:
    - `public static double average(int a, int b, int c)`: 세 개의 정수를 매개변수로 받고 `double`형을 반환
    - `return (double)(a + b + c) / 3`:
        - `(a + b + c)`로 세 수의 합을 구함
        - `(double)`로 형변환하여 실수 나눗셈이 되도록 함
        - `/3`으로 평균 계산

    - 형변환이 중요한 이유: 정수끼리 나누면 소수점이 버려지므로, 실수형으로 변환 후 나눠야 정확한 평균값을 얻을 수 있음

2. **main 메서드**:
    - 세 개의 정수 `a`, `b`, `c`를 입력받음
    - `average(a, b, c)` 메서드를 호출하여 결과를 `result` 변수에 저장
    - `System.out.println(result)`: 평균값을 출력

**형변환의 필요성**:
- `(a + b + c) / 3`: 정수 나눗셈 → 소수점 버려짐
- `(double)(a + b + c) / 3`: 실수 나눗셈 → 정확한 평균값

**계산 과정** (예시: `5 7 9`):
- 합계: `5 + 7 + 9 = 21`
- 평균: `21.0 / 3 = 7.0`

예시 입력 `5 7 9`에 대해 `average(5, 7, 9)`가 호출되어 `7.0`이 반환되고 출력됩니다.

 */