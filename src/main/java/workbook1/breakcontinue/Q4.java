package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {
        // TODO: 구구단 출력 중 결과가 30 이상이면 continue
        for(int i = 2; i <= 9; i++){        //구구단 앞자리 반복
            System.out.println(i+"단");      //출력시 구분을 위해 몇단인지 출력
            for(int j = 1; j <= 9; j++){     //구구단 뒷자리 반복
                int mul = i*j;              //구구단 결과
                if(mul >=30){               //구구단 결과가 30보다 클 경우
                    continue;               //건너뛰기
                }
                System.out.println(i + " * " + j + " = " + mul);    //결과 출력
            }
        }
    }
}
