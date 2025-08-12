package main.java.workbook1.breakcontinue;

public class Q4 {
    public static void main(String[] args) {

        // 구구단 출력 구문입니다.
        // 중첩된 반복문에서 if 문을 사용해 곰한 값이 30 이상일 경우
        // continue 하고, 아닐 경우 출력합니다.
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i*j>=30){
                    continue;
                }
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            // 개행용 sout입니다.
            System.out.println();
        }

        /*
        for (int i = 1; i<10; i++){
            for (int j = 1; j<10 && j*i<=10; j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
        // 또는 if문 안에 continue가 아닌 break; 를 사용할 수 있겠습니다.
        * */
    }
}
