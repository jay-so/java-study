package part4;
/*
비트 연산자 = 각각의 비트를 대상으로 연산을 진행하는 연산자, 피연산자는 반드시 정수여야 한다.
& : 비트 단위로 and 연산을 한다.
| : 비트 단위로 or 연산을 한다.
^: 비트 단위로 XOR 연산을 한다.
~ : 피연산자의 모든 비트를 반전시켜 얻은 값을 반환한다.
 */
public class BitOpMeans {
    public static void main(String[] args){
        byte n1 = 13;
        byte n2 = 7;
        byte n3 = (byte) (n1 & n2);//연산의 결과값은 int형이다.
        System.out.println(n3);
    }
}
