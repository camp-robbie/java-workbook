package main.java.workbook2.varscope;

class Sample {
    // 클래스 변수(정적 변수)
    // 모든 인스턴스가 '하나'를 공유
    static String classVar = "class";

    // 인스턴스 변수
    // 객체마다 '각각'의 값을 가짐
    String instanceVar = "instance";

    void printLocal() {
        // 지역변수: 메서드 안에서 선언되고, 메서드가 끝나면 사라짐

        String localVar = "local";
        // 요구 출력 형식: "local instance class" 이므로 공백 포함하여 이어서 출력
        // TODO: localVar 출력
        System.out.println(localVar + " ");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Sample s = new Sample();

        // 1) 지역변수 출력
        // : 메서드 내부에서만 접근 가능하므로 메서드가 출력
        s.printLocal();

        // TODO: instanceVar와 classVar 출력
        // 인스턴스 변수 instanceVar
        // : '객체를 통해' 접근
        System.out.print(s.instanceVar + " ");

        // 3) 클래스 변수 classVar
        // : '클래스명으로' 접근하는 것이 규칙
        //    객체로도 가능하지만 권장 X
        System.out.print(Sample.classVar);
    }
}