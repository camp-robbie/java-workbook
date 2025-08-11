package main.java.workbook1.controlflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String 으로 값을 받습니다.
        String input = sc.nextLine();
        // 공백을 제거한 값을 여러개 가진 String 배열을 사용합니다.
        // 배열을 사용한 이유 -> 초기화 이후 추가나 수정이 없음
        String[] numbers = input.split("\\s");

        // 인덱스로 사용할 변수 i와 더한 값이 저장될 변수 sum 입니다.
        int i = 0;
        int sum = 0;

        // i가 numbers의 길이보다 작을 때 돌아가는 while 문입니다.
        while(numbers.length>i){
            // 만약 입력값이 하나이고 0이라면 반복을 종료합니다.
            if (numbers.length == 1 && numbers[0].equals("0")){
                break;
            }
            // 양수를 합산하는 구문입니다. 만약 배열의 i 번째가 0보다 크다면(양수라면)
            // sum에 i번째 수를 더합니다.
            if(Integer.parseInt(numbers[i])>0){
                sum+=Integer.parseInt(numbers[i]);
            }
            // 증감이 필요합니다.
            i++;
        }

        // 출력문
        System.out.println(sum);
    }
}