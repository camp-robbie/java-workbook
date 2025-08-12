package main.java.workbook2.returntype;

import java.util.Scanner;

class Student {
    String name;
    int score;
    Student(String name, int score) {
        this.name = name; this.score = score;
    }
}

public class Q6 {
    // 점수(필드, int score)가 셋 중 가장 높은 객체를 반환하는 메서드입니다.
    public static Student bestStudent(Student s1, Student s2,  Student s3) {
        if (s1.score < s2.score) {
            if (s3.score < s2.score) {
                return s2;
            }else {
                return s3;
            }
        }else {
            if (s3.score < s1.score){
                return s1;
            }else{
                return s3;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n1 = sc.next(); int s1 = sc.nextInt();
        String n2 = sc.next(); int s2 = sc.nextInt();
        String n3 = sc.next(); int s3 = sc.nextInt();

        // 메서드를 호출합니다.
        // st는 가장 점수가 높은 객체의 메모리 주소를 참조합니다.
        Student st = bestStudent(new Student(n1,s1), new Student(n2,s2), new Student(n3,s3));

        // 출력합니다.
        System.out.println(st.name+" "+st.score);
    }
}
