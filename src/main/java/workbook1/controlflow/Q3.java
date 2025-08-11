package main.java.workbook1.controlflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        List<Integer> primeNumber = new ArrayList<Integer>();

        //중첩 반복문 입니다.
        // i(소수일 경우 리스트에 추가되는 값) 은 2부터 시작합니다.(1은 소수가 아니기 때문)
        // 내부 반복문에서 i가 소수인지를 판단하기 위해 1~i 까지의 수로 나눕니다.
        // 나누어서 나머지가 없는 값(나누어 떨어지는 값)이 3개 이상이라면 리스트에 i를 추가하지 않습니다.
        // 나누어 떨어지는 값이 1과 자신밖에 없다면 2가 나오기 때문입니다.
        for(int i = 2;i<=n;i++){
            for(int j=1;j<=i;j++){
                // 나누어 떨어지는 값이 있다면 count++
                if(i%j==0){
                    count++;
                }
            }
            // 만약 나누어 떨어지는 값이 2개라면 (1과 자신, 소수라면)
            // 리스트에 i를 추가합니다.
            if(count==2){
                primeNumber.add(i);
            }
            // count는 계속 사용되는 변수이니 초기화합니다.
            count = 0;
        }

        // 출력합니다.
        System.out.println(primeNumber);
    }
}