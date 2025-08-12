package main.java.workbook2.varscope;

class Sample {
    static String classVar = "class";
    String instanceVar = "instance";
    void printLocal() {
        String localVar = "local";
        // TODO: localVar 출력
        System.out.print(localVar + " ");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.printLocal();
        // TODO: instanceVar와 classVar 출력
        System.out.println(s.instanceVar + " " + Sample.classVar);
    }
}