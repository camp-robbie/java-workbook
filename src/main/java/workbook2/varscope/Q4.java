package main.java.workbook2.varscope;

public class Q4 {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    Q4() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Q4 d = new Q4();
        Q4 d2 = new Q4();
    }

    /*
    출력결과
    static block
    instance block
    constructor
    instance block
    constructor
                    static block이 한번만 실행됨
 */
}
