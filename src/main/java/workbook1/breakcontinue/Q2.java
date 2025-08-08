package main.java.workbook1.breakcontinue;

public class Q2 {
    public static void main(String[] args) {
        // TODO: 1~10 사이의 홀수만 출력하도록 continue 사용
        for (int num = 1; num <= 10; num++) {       //사고흐름 1. 3.
            if (num % 2 == 0) continue;             //사고흐름 2.
            System.out.print(num);                  //사고흐름 4.
        }
        //홀수에서 짝수로 변경
        /// 줄바꾸기
//        System.out.println();   // 13579 <br> 246810
        /// 반대로 1~10 사이의 짝수만 출력하도록 continue 사용
//        for (int num = 1; num <= 10; num++) {
//            if (num % 2 != 0) continue;
//            System.out.print(num);
        }
    }

/// 사고흐름
//1. 숫자 num은 1부터 시작해서 10까지 증가 (이 때, 숫자는 정수)
//2. 숫자 num이 짝수일 때 건너뛰고(cnntinue 활용) - int num%2 == 0 이면 짝수 / int num%2 != 0 이면 홀수
//3. for문 반복문 활용
//4. 홀수 인건 sout을 활용하여 출력