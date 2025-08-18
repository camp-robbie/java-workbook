package main.java.workbook2.returntype;

import java.util.Scanner;

class Student {                               // Student 클래스
    String name;                              // 매개변수 String name, int score
    int score;

    Student(String name, int score) {          // 생성자 정의
        this.name = name;                      // 필드 초기화
        this.score = score;
    }
}

public class Q6 {

    // TODO: bestStudent 메서드 작성 (Student 세 명 중 최고 점수를 받은 학생 반환)
    public static Student bestStudent(Student s1, Student s2, Student s3) {
        if (s1.score < s2.score) {                          // s1점수 < s2점수 -> return문 수행
                return (s2.score < s3.score) ? s3 : s2;     // s2점수 < s3 점수 -> 참: s3 반환 / 거짓: s2 반환
            } else {                                        // s2점수 < s1점수 -> return문 수행
                return (s1.score < s3.score) ? s3 : s1;     // s1점수 < s3 점수 -> 참: s3 반환 / 거짓: s1 반환
            }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);            // Scanner 생성

        String n1 = sc.next();    // 공백/개행으로 구분된 토큰 1개(문자열) 읽어 n1 에 저장
        int s1 = sc.nextInt();    // 다음 토큰을 int로 읽어 s1에 저장
        String n2 = sc.next();    // 다음 토큰을 String로 읽어 n2에 저장
        int s2 = sc.nextInt();    // 다음 토큰을 int로 읽어 s2에 저장
        String n3 = sc.next();    // 다음 토큰을 String로 읽어 n3에 저장
        int s3 = sc.nextInt();    // 다음 토큰을 int로 읽어 s3에 저장

        // TODO: bestStudent 메서드 작성 후 주석 해제
        Student st = bestStudent(new Student(n1,s1), new Student(n2,s2), new Student(n3,s3));
        // -> 메서드 호출하여 st(Studnet 타입)에 저장

        // TODO: st.name과 st.score 출력
        System.out.println(st.name + " " + st.score);  // st의 name, score 출력 (공백으로 구분)

        sc.close();                                    // 입력닫기
    }
}
