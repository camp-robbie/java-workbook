package main.java.workbook1.breakcontinue;

public class Q1 {
    public static void main(String[] args) {
        // TODO: 1부터 순차적으로 더하다가 10의 배수를 만나면 break
        // TODO 풀어서 설명 : 1부터 숫자를 증가시키며 누적 합을 구하다가, 10의 배수가 나타나면 반복을 종료 한다.

        /// 문제 흐름
        //1. 숫자 num은 1부터 시작해서 100까지 증가 (이 때, 숫자는 정수)
        //2. 숫자 num은 10의 배수인지 확인 ->  방법 : num%10 == 0  (나머지 연산자 확인)
        //3. 10의 배수가 나오기 직전까지 계속 더하기
        //4. 10의 배수가 나오면 멈추기 - break로 반복 종료
        //5. 그 이전까지의 합을 출력

        /// Version 1. for 문 안에서 num 선언한 버전
        int sum1 = 0;        // 누적 합을 저장할 변수 초기화
                            // 누적 합을 계속 더하려면 sum 이라는 변수 상자가 필요하다.
                            // 하지만 변수를 사용하려면 반드시 초기값이 있어야한다.

        // num은 1부터 시작하여 100까지 1씩 증가
        for (int num = 1; num <= 100; num++) {

            if (num % 10 == 0) break;
            // num이 10의 배수이면 반복문을 중단하여 더 이상 sum에 더하지 않음
            // 반복문(for, while 등) 전체를 즉시 종료시킴

            /// 주의
            /// version2. sum += num; 을 for 문 밖에서 쓰고 싶으면 int num; 을 먼저 선언해주어야 한다.
            // version1 여기에서는, for문 안에서 num을 `int num`으로 선언해준다.

            sum1 += num;  //은 반드시 break보다 먼저 실행되어야 함
                        // 그렇지 않으면 10의 배수도 sum에 포함되므로 문제의 조건에 어긋남
                        // 10의 배수가 나오기 전까지 num 을 sum에 더함.

            /// sum1 += num;의 위치
            // 올바른 위치 (반복문 조건 먼저 검사 -> break ->  합계에서 제외
            //for (int num = 1; num <= 100; num++) {
            //    if (num % 10 == 0) break; // 먼저 검사!
            //    sum += num;               // 10의 배수면 여기까지 못 옴
            //}

            // 잘못된 위치 (합계를 먼저 더함 -> 10의 배수까지 포함되어 출력
            //for (int num = 1; num <= 100; num++) {
            //    sum += num;               // 무조건 더함
            //    if (num % 10 == 0) break; // 이미 더한 뒤에 멈춤
            //}

        }
        // 누적 합을 출력
        // sum 은 1부터 9까지의 합 : 45
        System.out.println("for 문 안에서 num 선언 -> 합 : " + sum1); // 초기화된 sum 적용 // 합 : 45


        ///  version2. for 문 밖에서 num 선언 (나중에 외부에서 num 사용 가능)
        int sum2 = 0;
        int num = 0; // 반복문 바깥에서 미리 선언하면 반복이 끝난 후 num 값을 알 수 있다.

        for (num = 1; num <= 100; num++) {
            if (num % 10 == 0) break;
            sum2 += num;
        }

        // sum2는 반복 종료 후에도 출력해야 하므로 바깥 선언이 필수입니다.
        // num은 종료 조건이 걸린 숫자(여기선 10)로 종료되었음을 보여줄 수 있음
        System.out.println("for 문 밖에서 num 선언 -> 합 : " + sum2); // 합 : 45
        System.out.println("반복 종료 시 num 값 : " + num); // 10
    }
}

/// 추가 설명
///if (num % 10 == 0) break;
///             sum2 += num;
//
//num = 1 → if (1 % 10 == 0) → ❌ → sum2 += 1
//num = 2 → if (2 % 10 == 0) → ❌ → sum2 += 2
//...
//num = 9 → if (9 % 10 == 0) → ❌ → sum2 += 9
//num = 10 → if (10 % 10 == 0) → ✅ → break 실행 → sum2 += 10은 실행되지 않음
// 결론
//sum2 += num;은 10이 나오기 직전까지 실행됩니다.
//즉, num = 1 ~ 9까지만 더해지고, num = 10일 때는 더하지 않고 멈춥니다.

//Q.반복이 끝나고 나서 sum2 += num;이 실행되나요?
//A.아니요!!! break가 먼저 실행되기 때문에,
// sum2 += num;는 실행되지 않고 반복이 종료됩니다.