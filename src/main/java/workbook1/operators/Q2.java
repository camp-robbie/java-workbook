package main.java.workbook1.operators;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: 전위 증가와 후위 증가 결과 출력
        //1. 하나의 정수 입력 받기
        System.out.println("정수를 입력해주세요: ");
        int num = sc.nextInt();

        //2. 전위 증가 ++i
        // 전위 증가 : 주어진 변수를 먼저 증가시키고 그 결과를 사용한다.
        int preInc = ++num;

        //3. 후위 증가 i++
        // 후위 증가 : 주어진 변수를 먼저 사용하고 이후에 증가시킨다.
        int postInc = num++;

        //4. 결과 출력
//        System.out.println(preInc + " " + num + " " + postInc); // 6 7 6
        System.out.println(preInc + " " + postInc); // 6 6

        //  main() { 코드 종료 }
        // 코드 종료
        sc.close();
    }
}

/// 문제 분석
// 하나의 정수를 입력 받기
// 전위 증가값
// 후위 증가값
// 출력은 '6 6' 으로 보아
// 전위 증가값 " " 후위 증가값 출력하기

// 입력값이 5 일 때, ++num은 먼저 6으로 증가시키고 그 값을 preInc에 저장.
// nun++ 은 6을 postInc에 저장한 뒤, num을 7로 증가시킴.
// 출력은 preInc와 증가된 num 이므로 6 7 이 될 것 같았지만
// 문제 예시처럼 6 6으로 나왔다.

// preInc : ++num -> num이 먼저 6으로 증가하고, 그 값을 preInc에 저장하니, 6
// postInc : num++ -> 숫자 6을 pstInc에 저장하고, 그 후 num은 7로 증가하니, 6
// 즉, postInc는 증가 전의 값을 저장하고, num 자체는 이후에 7이 됩니다.
// 하지만 출력문 System.out.println(preInc + " " + postInc);에서
// num이 아닌 postInc를 출력하므로 둘 다 6 이 되는 것이다.