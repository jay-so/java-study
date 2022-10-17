package part3;

public class IntegerLiteral {
    public static void main(String[]args){
        int binaryNumber = 0B100; //2진수 표현
        int decimalNumber = 0130;  //8진수 표현
        int octalNumber = 130;   //10진수 표현
        int hexadecimal = 0x130;  //16진수 표현

        System.out.println("2진수로 표현한 값 : " + binaryNumber);
        System.out.println("8진수로 표현한 값 : " + decimalNumber);
        System.out.println("10진수로 표현한 값 : " + octalNumber);
        System.out.println("16진수로 표현한 값 : " + hexadecimal);
    }
}
