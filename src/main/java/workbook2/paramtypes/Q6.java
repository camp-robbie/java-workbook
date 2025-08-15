package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {       // 불변(String) vs 가변(StringBuilder)
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성

    /**
     * String은 불변(immutable) -> 내부 문자가 바뀌지 않음. 새로운 문자열을 '반환'해야 함.
     * (호출 측에서 그 반환값을 다시 변수에 '재할당'하지 않으면 원본은 그대로)
     */

    public static String addExclamation(String s) {
        // 메서드 안에서 s += "!"를 해도 '새로운 String'을 만들어 반환할 뿐,
        // 원래 s(호출한 곳의 변수)는 자동으로 바뀌지 않습니다.
        return s + "!";
    }

    /**
     * StringBuilder는 가변(mutable) -> append 하면 같은 객체 내부가 직접 바뀜.
     * 동일한 StringBuilder 객체 내에서 문자열이 직접 수정된다는 의미.
     * 즉, append를 사용해도 새로운 객체가 만들어지는 것이 아니라 기존 객체의 내용이 변경
     */

    public static void addExclamation(StringBuilder sb) {
        if (sb != null) {
            sb.append('!'); // 같은 객체의 버퍼에 '!' 추가
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();                               // 입력: Hello
        StringBuilder sb = new StringBuilder(sc.next());    // 입력: Java

        addExclamation(s); // TODO: addExclamation(String s) 메서드 작성 후 주석 해제
        addExclamation(sb); // TODO: addExclamation(StringBuilder sb) 메서드 작성 후 주석 해제
        // TODO: s와 sb 출력

        // 불변 String: 반환값을 '재할당'하지 않으면 s는 그대로 유지됨
        addExclamation(s); // 반환값을 무시 → s는 여전히 "Hello"

        // 가변 StringBuilder: 내부가 직접 변경됨
        addExclamation(sb); // sb → "Java!"

        // 요구 출력: "Hello Java!"
        System.out.println(s + " " + sb.toString());

        sc.close();
    }
}