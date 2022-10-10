package part1;

/*
   자바 프로그램의 출력 예시
 */
public class SystemOutPrintln {
    public static void main(String []args){
        System.out.println(7);//숫자 7출력
        System.out.println(3.15);//숫자 3.15 출력
        System.out.println("3+5 = " + 8);//출력 "3 +5  = " 숫자 8출력
        System.out.println(3.15 + "는 실수입니다.");//출력: 숫자 3.15는 실수입니다.
        System.out.println("3 + 5 " + "의 연산 결과는 8입니다.");//출력: 3 + 5의 연산결과는 8입니다.
        System.out.println(3 + 5); //숫자 8출력

        System.out.println(3 + 5);
        System.out.println("2+5 = " + 2+5); //출력: 2+5 = 25
        System.out.println("2+5 = "+ (2+5));//출력: 2+5 = 7

        System.out.println("12");//문자열 12 출력
        System.out.println((1*3)*4);
        System.out.println(3*4);
        System.out.println((3+3)+(3+3));
        System.out.println(3+3+3+3);
    }
}
