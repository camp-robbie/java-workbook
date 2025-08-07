package main.java.workbook1.breakcontinue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        // 출력 예시에서의 값이 실수형이기 때문에 실수형으로 선언합니다.
        // 이후 연산 시, double로 자동 형변환 됩니다.
        double sum = 0;

        // 입력을 받는 반복문입니다.
        // 음수를 입력할 시, break 되며
        // 양수일 경우 리스트에 추가됩니다.
        while (true){
            int n = sc.nextInt();
            if (n<0){
                break;
            }else  {
                list.add(n);
            }
        }

        // 리스트에 있는 요소를 더해줍니다.
        for (int num:list) {
            sum+=num;
        }

        // 출력문입니다. 더한 수에 리스트의 길이를 나누어 평균을 구합니다.
        System.out.println(sum/list.size());
    }
}