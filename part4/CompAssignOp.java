package part4;
/*
  복합 대입 연산자 = 대입 연산자가 다른 연산자와 묶여서 정의된 형태의 연산자
  (일반): a = a+b  (대입) a +=b
  (일반): a = a-b  (대입) a -=b
  (일반): a = a*b  (대입) a *=b
  (일반): a = a/b  (대입) a /=b
  (일반): a = a%b  (대입) a %=b
 */
public class CompAssignOp {
    public static void main(String[] args){
        short num = 10;
        num = (short)(num + 77L);
        int rate = 3;
        rate = (int)(rate * 3.5);
        System.out.println(num);
        System.out.println(rate);

        num = 10;
        num +=77L;
        rate = 3;
        rate *=3.5;
        System.out.println(num);
        System.out.println(rate);

    }
}
