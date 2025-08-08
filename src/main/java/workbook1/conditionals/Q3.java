package main.java.workbook1.conditionals;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        // TODO: 평균을 계산하고 중첩 if-else로 학점 출력
        int avg = (s1 + s2 + s3) / 3; // 평균(avg) 계산

        if (avg >= 90){
            System.out.println("A");  // 평균(avg)이 90 이상이면 A 출력, 아니면 else 구문으로

        } else{
            if(avg >= 80){
                System.out.println("B");  // 평균(avg)이 80 이상이면 B 출력, 아니면 else 구문으로

            }else{
                if(avg >= 70){
                    System.out.println("C");  // 평균(avg)이 70 이상이면 C 출력, 아니면 else 구문으로

                }else{
                    if(avg >= 60){
                        System.out.println("D");  // 평균(avg)이 60 이상이면 D 출력, 아니면 else 구문으로

                    }else{
                        System.out.println("F");  // 그 외 (평균이 60미만) F 출력
                    }
                }
            }
        }
    }
}