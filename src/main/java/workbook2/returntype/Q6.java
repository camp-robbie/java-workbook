package main.java.workbook2.returntype;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Q6 {
    // TODO: bestStudent 메서드 작성 (Student 세 명 중 최고 점수를 받은 학생 반환)
    public static Student bestStudent(Student student, Student student2, Student student3) {
        // 입력 받은 점수들 중 같은 점수가 존재한다면..
        if (student.score == student3.score || student.score == student2.score || student2.score == student3.score) {
            throw new IllegalArgumentException(); // 예외 생성
        } else if (student.score > student2.score && student.score > student3.score) { // 1의 점수가 가장 높다면
            return student; // 학생1 반환
        } else if (student2.score > student.score && student2.score > student3.score) { // 2의 점수가 가장 높다면
            return student2; // 학생2 반환
        } else { // 3의 점수가 가장 높다면
            return student3; // 학생3 반환
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String n1 = sc.next();
            int s1 = sc.nextInt();

            String n2 = sc.next();
            int s2 = sc.nextInt();

            String n3 = sc.next();
            int s3 = sc.nextInt();

            Student st = bestStudent(
                    new Student(n1, s1),
                    new Student(n2, s2),
                    new Student(n3, s3)
            ); // TODO: bestStudent 메서드 작성 후 주석 해제

            // TODO: st.name과 st.score 출력
            System.out.println(st.name + " " + st.score);
        } catch (InputMismatchException e) { // 정수를 받아야하는 int 변수에 문자를 입력한다면..
            System.out.println("점수에 대한 값을 정확하게 입력해주세요!"); // 예외 처리
        } catch (IllegalArgumentException e) { // 입력된 숫자 중 같은 점수가 존재한다면.
            System.out.println("같은 점수가 존재합니다."); // 예외 처리
        } finally { // 항상 실행
            sc.close(); // 자원 누수 방지
        }
    }
}
