package part4;

/*
Postfix 연산자
val = n++; => val에 n의 값을 저장한 뒤 이후 줄에서 n의 1값 증가
val = n--; => val에 n의 값을 저장한 뒤 이후 줄에서 n의 값 1 감소

 System.out.println: 출력 후 행을 띈다.
 System.out.print: 출력하고 행을 띄지 않는다.
 */

public class PostfixOp {
    public static void main(String[] args){
       int num = 5;
       System.out.print((num++)+" ");
       System.out.print((num++) + " ");
       System.out.print(num + "\n");

       System.out.print((num--) + " ");
       System.out.print((num--)+ " ");
       System.out.print(num);
    }
}
