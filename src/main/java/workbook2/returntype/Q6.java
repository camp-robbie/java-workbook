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
    // TODO: bestStudent 메서드 작성 (Student 세 명 중 최고 점수를 받은 학생 반환)
    // bestStudent 메서드 (매개변수: Student n1, Student n2, Student n3 / 반환 타입: Student)
    public static Student bestStudent(Student n1, Student n2, Student n3) {
        if (n1.score >= n2.score && n1.score >= n3.score) {     // n1이 제일 크면
            return n1;                                          // n1 반환
        } else if (n2.score >= n1.score && n2.score >= n3.score) {  // n2가 제일 크면
            return n2;                                              // n2 반환
        } else {                                                // n3가 제일 크면
            return n3;                                          // n3 반환
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next(); int s1 = sc.nextInt();
        String n2 = sc.next(); int s2 = sc.nextInt();
        String n3 = sc.next(); int s3 = sc.nextInt();
        Student st = bestStudent(new Student(n1,s1), new Student(n2,s2), new Student(n3,s3)); // TODO: bestStudent 메서드 작성 후 주석 해제
        // TODO: st.name과 st.score 출력
        System.out.println(st.name + " " + st.score);   // 결과를 출력함
    }
}
