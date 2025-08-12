package main.java.workbook2.paramtypes;

import java.util.Scanner;

// Pair 클래스 정의 //
class Pair {
    int a;                       // 필드 a 선언
    int b;                       // 필드 b 선언
    Pair(int a, int b) {         // 생성자 정의
        this.a = a; this.b = b;  // 필드 초기화(a, b)
    }
}

public class Q5 {
    // TODO: swapPair 메서드 작성 (Pair 객체의 a와 b 값을 교환)
    public static void swapPair(Pair pair){         // swapPair 메서드 정의 (매개변수: Pair pair) -> a / b 값 서로 변경해주는 메서드
        int temp = pair.a;                          // a값을 temp에 임시 보관
        pair.a = pair.b;                            // pair.a 에 pair.b 값 대입
        pair.b = temp;                              // pair.b 에 temp(=pair.a) 값 대입
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         // Scanner 생성
        int x = sc.nextInt();                        // 첫 번째 정수 읽어 x에 저장 (공백/개행 전 정수 1개)
        int y = sc.nextInt();                        // 두 번째 정수 읽어 y에 저장 (공백/개행 전 정수 1개)
        Pair pair = new Pair(x, y);                  // Pair 객체 생성 (Pair 객체를 생성하여, 그 참조값을 pair에 담는다)
        // -> x, y의 값을 복사해 a, b를 초기화 (참조 공유x)
        // TODO: swapPair 메서드 작성 후 주석 해제
         swapPair(pair);                             // swapPair 메서드 호출 ( 같은 객체의 필드(a,b)값 서로 교환 )
        // -> 같은 객체(같은 참조) 사용해 a와 b 교환 (x, y 변수 자체는 변하지 않음)
        // TODO: pair.a와 pair.b 출력
        System.out.println(pair.a + " " + pair.b);   // [ pair.a + 공백 + pair.b ] 값 출력
        // System.out.println(x); -> 그대로 x = 5 출력        => x, y 변수 값 자체는 변화없음
        // System.out.println(y); -> 그대로 y = 10 출력

    }
}
/*    1. Pair pair = new Pair(x, y);
          - 객체가 하나 만들어지고, 변수 pair 에는 그 객체의 참조값 들어감
      2. swapPair(pair) 호출
          - 참조값이 복사되어 메서드 매개변수 pair로 들어옴
             -> 메서드 안의 pair 도 같은 객체를 가리킴
      3. pair.a / pair.b 값 변경 시
          - 같은 객체의 필드 값이 변경 되는 것! (참조 자체는 그대로)
 */

/*   Q. 여기서 클래스(Pair)를 정의해 사용하는 이유? (목적)
          - 두 값을 한 객체에 담아 메서드에서 그 객체의 필드 값(a,b)을 바꾸면,
            호출자(main)도 같은 객체를 보고 있으니 바뀐 게 보이게 하려는 것.
             => 메서드(swapPair) 안에서 바꾼 값이, 호출한 쪽(main)에서도 그대로 보이게 하려는 목적
             => "main의 pair" 와 "swapPair의 pair" 가 같은 객체 가리킴

          - 같은 방식으로 사용이 필요한 경우, 다른 변수로 객체 생성해 재사용 가능
             => 확장성 / 캡슐화

          [일반적 클래스 목적]
             - 관련 데이터 묶기 -> 의미 부여 / 가독성
             - 규칙/검증 넣기 -> 캡슐화 / 불변성 여부 선택
             - 행동 추가 -> swap(), toString(), 비교
             - 타입 안전성

 */

/*
      1)기본형 : '값'만 복사
                 -> 호출자 변수(x,y) 변경 불가 => [swap(x,y)] 이걸로 변경 안됨
                 -> 메서드 안의 변경이 호출자에 안 보임

      2)참조형 : '참조값'을 복사
                 - 메서드 / 호출자 가 같은 객체를 봄(참조 공유)
                 - 같은 객체의 "필드 값" 변경(p.a, p.b)은 호출자에게 보임
                 - 매개변수에 " new로 재할당[p = new Pair(...)] 한 건 호출자에게 반영 안됨
                    => 호출자 변수(x,y)처럼 " 변수 자체 변경 불가능은 동일! "

      3)공통점
         - 둘 다 지역변수 이므로 매개변수 자체는 안보임  => 직접 접근/조회 불가
         - 메서드 내부 변경이 있어도 호출자 변수(x, y) 자체는 변경 안됨
 */