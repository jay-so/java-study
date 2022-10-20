package part10;


import java.time.LocalDate;

public class DateOfExecution {
    static String data; //프로그램의 실행 날짜를 저장하기 위한 변수

    //클래스 로딩 시 단 한 번 실행되는 영역
    static {
        LocalDate nDate = LocalDate.now();
        data = nDate.toString();
    }


    public static void main(String[]args){
        System.out.println(data);
    }
}
