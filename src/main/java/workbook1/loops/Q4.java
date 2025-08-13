package main.java.workbook1.loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 m행, 가로행입니다 m: ");
        int m = sc.nextInt();
        System.out.print("정수 n열, 세로열입니다 n: ");
        int n = sc.nextInt();
        // TODO: 이중 for 문으로 별 패턴 출력
        // 중첩 for 문

//        for (int i = 0; i <= m; i++) {          //i <= m → i는 0부터 m까지, 즉 총 m + 1번 반복
//            for (int j = 0; j <= n; j++) {      //j <= n → j는 0부터 n까지, 즉 총 n + 1번 반복
//                                                //즉, 별을 (m + 1)행, (n + 1)열로 출력
//                System.out.print("*"); // 결과 : ********************
//            }
//            System.out.println();
//        }
        ///  수정
        for (int i = 0; i < m; i++) {           //i < m → i는 0부터 (m - 1)까지, 즉 총 m번 반복
            for (int j = 0; j < n; j++) {       //j < n → j는 0부터 (n - 1)까지, 즉 총 n번 반복
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//비교
//for (int i = 0; i <= m; i++) 의 반복 횟수
//시작값: i = 0
//종료 조건: i <= m
//즉, i = 0, 1, 2, ..., m 까지 포함 → 총 반복 횟수 = (m - 0 + 1) = m + 1번
//예: m = 3이면 → i = 0, 1, 2, 3 → 4번 반복

//for (int i = 0; i < m; i++) 의 반복 횟수
//시작값: i = 0
//종료 조건: i < m
//즉, i = 0, 1, 2, ..., m - 1 → 총 반복 횟수 = (m - 0) = m번
//예: m = 3이면 → i = 0, 1, 2 → 3번 반복

//조건식 : i <= m
//실제 반복 획수 : m + 1 번
//i의 값 : 0 ~ m

//조건식 : i < m
//실제 반복 횟수 : m 번
//i의 값 : 0 ~ m - 1