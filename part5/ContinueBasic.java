package part5;

/*
continue문 = 반복문의 나머지 부분을 생략하고 프로그램의 흐름을 조건 검사 부분으로 이동한다.
- 사진 참고 : break문과 continue문의 비교

 */


public class ContinueBasic {
   public static void main(String[]args){
       int num = 0;
       int count = 0;

       while((num++)<100) {
           if(((num%5)!=0)||((num%7)!=0)){ //num이 5의 배수가 아니면서 7의 배수가 아니라면
               continue; //조건으로 이동하겠다.
           }else {
               System.out.println(num);
               count ++; //5와 7의 배수인 경우에만 실행하겠다./
           }
       }
       System.out.println("count: " + count);
   }
}
