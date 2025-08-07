package main.java.workbook1.controlflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        // 인덱스로 참조하기 위해 리스트를 사용합니다.
        List<Integer> numbers = new ArrayList<Integer>();

        // 실제 계산에 사용할 정수를 입력받는 구문입니다.
        // count 만큼 반복합니다.
        for(int i=0;i<count;i++){
            numbers.add(sc.nextInt());
        }

        // 더한 값을 저장할 변수를 선언합니다.
        int plusCount = 0;
        int minusSum = 0;

        // 왜 numbers.length() 가 아닌 count를 사용했는가
        // 실질적으로 numbers.length() 와 count가 같기 때문입니다.
        for(int i=0;i<count;i++){
            // 0은 양수로 처리합니다.
            if(numbers.get(i)>=0){
                plusCount += 1;
            }else{
                minusSum+= numbers.get(i);
            }
        }

        // 출력합니다.
        System.out.println(plusCount+" "+minusSum);
    }
}