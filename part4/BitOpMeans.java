package part4;

public class BitOpMeans {
    public static void main(String[] args){
        byte n1 = 13;
        byte n2 = 7;
        byte n3 = (byte) (n1 & n2);//연산의 결과값은 int형이다.
        System.out.println(n3);
    }
}
