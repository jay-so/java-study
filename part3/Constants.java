package part3;

/*
 상수란 "값이 변하지 않는 수"를 의미합니다.
 변수 선언 시 앞에 final이라는 선언을 추가하면 그 변수는 '상수'가 됩니다.
 - 값을 딱 한번만 할당할 수 있습니다.
 - 할당 된 값은 프로그램 내에서 변경이 불가합니다.
 규칙
  - 상수의 이름은 모두 대문자로 짓습니다.
  - 둘 이상의 단어로 이루어질 경우 단어 사이에 언더바를 사용합니다.
 */
public class Constants {
    public static void main(String[] args){
       final int MAX_SIZE = 100;
       final char CONST_CHAR = '상';
       final int CONST_ASSIGNED; //상수 선언
        CONST_ASSIGNED = 12; //상수 CONST_ASSIGNED의 값은 12로 할당
        System.out.println("상수1 : " +MAX_SIZE);
        System.out.println("상수2 : " + CONST_CHAR);
        System.out.println("상수3 : " + CONST_ASSIGNED);
    }
}
