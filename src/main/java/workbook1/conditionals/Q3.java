package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        // int를 사용한 이유 -> 자세한 평균을 반환하는 프로그램이 아님.
        // 평가 결과만을 출력하면 되는 프로그램이기 때문에
        // 소숫점이 탈락되어도 됩니다.
        // 또한, avg>89 와 같은 연산을 가능하게 합니다.
        // 89.99 의 경우 89보다 크지만 A가 아니지만, avg>89와 같은 연산을 사용할 경우
        // 원하지 않은 결과가 출력될 수 있음.
        // 아래의 if 문에서는 avg>=89 와 같은 조건을 주지 않았습니다(가독성 고려)
        int avg = (s1+s2+s3)/3;

        // 중첩 if-else문을 사용하였습니다.
        // 평균이 80 이상이라면
        if (avg>=80){
            // 평균이 80 이상이며 90 이상이라면
            if (avg>=90){
                System.out.println("A");
            }else{
                // 평균이 80 이상 90 미만이라면
                System.out.println("B");
            }
        }else {
            if (avg>=70){
                System.out.println("C");
            }else {
                if (avg>=60){
                    System.out.println("D");
                }else {
                    System.out.println("F");
                }
            }
        }

    }
}