package main.java.workbook2.varscope;

class Sample {

    // static : 컴파일 할 때 생성됩니다.
    // 클래스가 메모리에 올라올 때(실행 될 때, 컴파일 시점)메모리에 고정적으로 생성되며,
    // 만약 메서드라면 인스턴스 변수를 사용할 수 없습니다.
    // 또한, static 으로 생성한 메서드 혹은 변수는
    // 해당 클래스 형태를 가지는 모든 객체가 공유합니다.
    static String classVar = "class";

    // 객체 변수 : 객체를 생성할 때 생성됩니다. (new 등)
    // 클래스 전체에서 사용 가능합니다.
    String instanceVar = "instance";

    // 로컬 변수(지역 변수) : 메서드 내부에서만 사용되는 변수입니다.
    // 변수가 속한 블럭 안에서만 사용할 수 있습니다.
    void printLocal() {
        String localVar = "local";
        System.out.print(localVar+" ");
    }
}

public class Q1 {
    public static void main(String[] args) {

        Sample s = new Sample();

        // 로컬 변수는 메소드 내부에서만 사용이 가능하기 때문에,
        // return 을 사용하여 값을 넘겨주거나,
        // 메소드 안에 출력 구문까지 구현하여야 출력이 가능합니다.
        s.printLocal();

        // 객체 변수(인스턴스 변수)는 객체가 생성될 때 만들어지기 때문에,
        // 객체를 통해 접근해야 합니다.
        System.out.print(s.instanceVar+" ");

        // 클래스 변수(static 변수)는 컴파일 시점에서 생성되기 때문에,
        // 객체 생성 없이도 사용할 수 있습니다.
        // 또한, 속한 클래스 타입의 모든 객체에서 공유합니다.(단 한 번만 생성됨.)
        System.out.print(Sample.classVar);
    }
}