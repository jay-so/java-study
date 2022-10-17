package part3;
/*
이스케이프 시퀀스 = 유니코드 문자들 중 키보드로 입력하기 어려운 문자의 표현을 위한 상수 입니다.
'\b'    백스페이스 문자
'\t'    탭 문자
'\\'    백슬레시\문자
'\''    작은 따옴표 문자' 표현
'\"'    큰 따옴표 문자" 표현
'\n'    개 행 문자 표현
 */

public class EscapeSequences {
    public static void main(String[] args){
        System.out.println("AB" + '\t' + 'C');
        System.out.println("AB" + '\\' + 'C');
        System.out.println("AB" + '\'' + 'C');
        System.out.println("AB" + '\n' + 'C');
    }
}
