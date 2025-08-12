package main.java.workbook2.returntype;

import java.util.Scanner;

class Student {
    String name;
    int score;
    Student(String name, int score) {
        this.name = name; this.score = score;
    }
    public int getScore(){
        return score;
    }
}

public class Q6 {
    // TODO: bestStudent 메서드 작성 (Student 세 명 중 최고 점수를 받은 학생 반환)
    public static Student bestStudent(Student s1, Student s2, Student s3){
        if(s1.getScore()>s2.getScore() && s1.getScore()>s3.getScore()){
            return s1;
        }else if(s2.getScore()>s1.getScore() && s2.getScore()>s3.getScore()){
            return s2;
        }else{
            return s3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 1의 이름 | 점수");
        String n1 = sc.next(); int s1 = sc.nextInt();
        System.out.println("학생 2의 이름 | 점수");
        String n2 = sc.next(); int s2 = sc.nextInt();
        System.out.println("학생 3의 이름 | 점수");
        String n3 = sc.next(); int s3 = sc.nextInt();

        Student st = bestStudent(new Student(n1,s1), new Student(n2,s2), new Student(n3,s3));
        // TODO: st.name과 st.score 출력
        System.out.println(st.name + " " + st.score);
    }
}
