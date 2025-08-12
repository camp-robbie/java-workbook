package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    public static String addExclamation(String s){
        return s+"!";
    }
    public static void addExclamation(StringBuilder sb){
        sb.append("!");
    }
    public static void main(String[] args) {

        // 불변 객체와 가변 객체에 대한 문제입니다.
        // 불변 객체 : 클래스의 인스턴트가 생성된 후, 내부 상태를 변경할 수 없는 객체
        // 가변 객체 : 클래스의 인스턴트가 생성된 후, 내부 상태를 변경할 수 없는 객체

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());

        // 메서드를 호출합니다.
        // String s : 불변 객체, 변하지 않음.
        // 따라서, 새 변수를 만들어 할당해주어야 합니다.
        String modifiedString = addExclamation(s);
        // StringBuilder : 가변 객체, 변할 수 있음.
        // 따라서, 새 변수를 만들지 않아도 수정한 값이 출력될 수 있습니다.
        addExclamation(sb);

        // 출력합니다.
        System.out.println(s+" "+sb);
        System.out.println("수정된 String s : "+modifiedString);
    }
}