package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2; i<=n; i++){              //2부터 n까지 반복
            boolean isPrime = true;             //flag 생성! 매 외부 반복마다 하나씩 생성되는 변수를 true로 초기화
            for(int j = 2; j<i; j++) {           //분모 2 ~ i-1까지 반복
                if (i % j == 0) {               //내부 for문 도는 동안 나머지가 0인 값이 생기면 소수가 아님!!!
                    isPrime = false;            //소수가 아닌 i의 isPrime = false로 바꾸고
                    break;                      //내부 for문을 벗어나 다음 외부 for문 숫자로 이동
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}

