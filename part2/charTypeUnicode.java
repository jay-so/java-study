package part2;

public class charTypeUnicode {
    public static void main(String[]args){
        /*
        java의 문자 자료형은 char형 입니다.
        모든 운영체제에는 문자의 표현에 대한 약속이 잇는데 이것을 문자 셋이라고 부릅니다.
        모든 나라의 문자를 수용하여 전 세계적으로 사용할 수 잇는 문자 셋을 사용하게 되었는데 이것을 '유니 코드'라고 합니다.
        유니코드 = 전세계의 모든 문자 하나를 2바이로 표현하는 문자 체계입니다.
         */



        char ch1 = '헐';
        char ch2 = '확';
        char ch3 = 54736;//문자 '헐'의 유니코드 값
        char ch4 = 54869;//문자 '확'의 유니코드 값
        char ch5 = 0xD5D0;
        char ch6 = 0xD655;
        System.out.println(ch1 + " " + ch2);
        System.out.println(ch3 + " " + ch4);
        System.out.println(ch5 + " " + ch6);
    }
}
