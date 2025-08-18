package main.java.workbook2.varscope;

class Sample {
    static String classVar = "class";
    String instanceVar = "instance";

    void printLocal() {
        String localVar = "local";
        // TODO: localVar 출력
        System.out.print("지역변수 :" + localVar);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Sample s = new Sample();

        s.printLocal(); // 지역변수 메서드 호출

        // TODO: instanceVar와 classVar 출력
        System.out.print(" 인스턴스 변수 :"+s.instanceVar);
        System.out.println(" 클래스 변수 :"+s.classVar);
    }
}