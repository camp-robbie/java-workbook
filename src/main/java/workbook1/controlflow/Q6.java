package main.java.workbook1.controlflow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // TODO: 1~n까지 중 자리수 합이 5의 배수인 수의 개수 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            String str = Integer.toString(i);

            for (int j = 0; j < str.length(); j++) {
                sum += Integer.parseInt(str.substring(j, j + 1));
            }

            if (sum%5 == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);

        /*
        System.out.println(str + "=>" + sum); 을 찍으면 결과값이 아래와 같아서
        1=>1
        2=>2
        3=>3
        4=>4
        5=>5
        6=>6
        7=>7
        8=>8
        9=>9
        10=>1
        11=>2
        12=>3
        13=>4
        14=>5
        15=>6
        16=>7
        17=>8
        18=>9
        19=>10
        20=>2
        5, 5, 10 으로 3이 나와야 하는데 출력 예시가 왜 2인지 모르겠음
        */
    }
}