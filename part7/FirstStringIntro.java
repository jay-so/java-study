package part7;

public class FirstStringIntro {

    //String 참조변수를 매개변수로 선언하여 문자열을 전달받을 수 있음
    public static void printString(String str){
        System.out.print(str);
    }
    public static void main(String[]args){
        //문자열 선언과 동시에 참조변수로 참조한다.
        String str1 = "Happy";
        String str2 = "Birthday";
        System.out.println(str1 + " " + str2);

        //printString 메소드를 이용한 다양한 String 문자열 출력 방법
        printString(str1);
        printString(" ");
        printString(str2);
        printString("\n");
    }

}