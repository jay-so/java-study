package part7;
/*
 문자열 = 여러 문자의 모임 ( " " 로 표현)
 String myName = "Jay-So"
 참조 변수 myName이 문자열 Jay-so를 가리키고 있다.
 String은 자바에서 제공하는 클래스의 이름이다.
 1) 문자열을 메소드의 인자로 전달할 수 있다.
 2) 매개변수로 String형 참조 변수를 선언하여 문자열을 인자로 전달받을 수 있다.

 */
public class FirstStringIntro {
    public static void main(String[] args) {
        //문자열 선언과 동시에 참조변수로 참조한다.
        String str1 = "Happy";
        String str2 = "Birthday";
        System.out.println(str1 + " " + str2);

        //메소드에 문자열을 전달하는 상황
        printString(str1);
        printString(" ");
        printString(str2);
        printString("\n");
        printString("End of program~ \n");
    }
    //String 참조변수를 매개변수로 선언하여 문자열을 전달 받을 수 있다.
    public static void printString(String str){
        System.out.print(str);
    }

}