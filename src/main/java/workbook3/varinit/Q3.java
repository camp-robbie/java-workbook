package main.java.workbook3.varinit;

public class Q3 {
    static int s;                                       //Static 변수
    int i;                                              //
    static {                                            //가장 먼저 출력
        System.out.println("static block");
    }
    {
        System.out.println("instance block");           //세 번째 출력
    }
    Q3() {
        System.out.println("constructor");
    }           //네 번째 출력
    public static void main(String[] args) {
        System.out.println("static variable");          //두 번째 출력
        Q3 obj = new Q3();
        System.out.println("instance variable");        //다섯 번째 출력
    }
}
