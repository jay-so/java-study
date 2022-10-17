package part5;

/*
 조건 -> if 문(~라면)
        else문(~이 아니라면)
 */

/*
   if문의 골격
   - if 문 ( )의 소괄호 = true 또는 false값을 나타내는 조건, 혹은 값이 오게 된다.
   - true가 오게 되면 if문의 부분이 실행된다.
   if(true or false) {
     조건이 true일 시 실행되는 영역
   }

   if ~ else문의 골격
   - if ~ else문은 if절과 else절로 나뉘게 된다.
   - 조건이 참일 때 (true)일 때 실행되는 if문 부분의 영역, 조건이 거짓(false)일 때 실행되는 else문 부분의 영역이 실행된다.

   if(true or false) {
        조건 true 일 때 실행 되는 영역
   }else{
     조건이 false일 때 실행되는 영역

   }

 */


public class IEBasic {
    public static void main(String[]args){
        int n1 = 5;
        int n2 = 7;

        //if문(~라면)
        if(n1<n2){ //n2가 n1보다 크더라면
            System.out.println("n1 < n2 is true");
        }

        //if ~ else문(~라면, ~가 아니라면)
        if(n1 == n2){ //n1이 n2와 같으면
            System.out.println("n1 == n2 is true");
        }else{ //n1이 n2와 같지 않다면
            System.out.println("n1 == n2 is false");
        }
    }
}
