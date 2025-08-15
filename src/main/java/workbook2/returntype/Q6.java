package main.java.workbook2.returntype;

import java.util.Scanner;

class Student {
    String name;
    int score;
    Student(String name, int score) {
        this.name = name; this.score = score;
    }
}

public class Q6 {       // 세 Student 중 최고 점수 학생 반환
    /**
     * 문제 설명에 “평균 점수”라는 표현이 있으나, 입력이 1인당 1개 점수이고 예시 출력도 최고 점수이므로 최고 점수 기준으로 구현했습니다.
     */

    // TODO: bestStudent 메서드 작성 (Student 세 명 중 최고 점수를 받은 학생 반환)

    /**
     * bestStudent: 세 학생 중 '점수가 가장 높은' 학생 객체의 참조를 반환한다.
     * - 동점이 있을 경우, 먼저 등장한 학생을 반환하도록 규칙을 정한다.
     * - 반환 후, 그 참조로 필드를 바꾸면 원본 Student도 바뀐다(참조형 주의).
     */

    public static Student bestStudent(Student s1, Student s2, Student s3) {
        Student best = s1;                  // 일단 s1이 최고라고 가정
        if (s2.score > best.score) best = s2;
        if (s3.score > best.score) best = s3;
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 예: Kim 80 Lee 90 Park 85
        String n1 = sc.next(); int s1 = sc.nextInt();
        String n2 = sc.next(); int s2 = sc.nextInt();
        String n3 = sc.next(); int s3 = sc.nextInt();

        Student st = bestStudent(
                new Student(n1,s1),
                new Student(n2,s2),
                new Student(n3,s3)); // TODO: bestStudent 메서드 작성 후 주석 해제
        // TODO: st.name과 st.score 출력

        System.out.println(st.name + " " + st.score); // Lee 90

        sc.close();
    }
}
