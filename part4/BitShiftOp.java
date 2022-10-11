package part4;

/*
 비트 쉬프트 연산자: <<, >>, >>>
 <<: 피연산자의 비트 열을 왼쪽으로 이동, 이동에 따른 빈 공간은 0으로 채움
 >>: 피연산자의 비트 열을 오른쪽으로 이동, 이동에 따른 빈 공간은 음수일 경우 1, 양수일 경우 0으로 채움
 >>> : 피연산자의 비트 열을 오른쪽으로 2칸 이동, 이동에 따른 빈 공간은 0으로 채움
 */
public class BitShiftOp {
    public static void main(String[] args){
        byte num;

        num = 2;
        System.out.print((byte)(num<<1) + " ");
        System.out.print((byte)(num<<2) + " ");
        System.out.println((byte)(num<<3) + " ");

        num = 8;
        System.out.print((byte)(num >> 1) + " ");
        System.out.print((byte)(num >> 2) + " ");
        System.out.println((byte)(num >>3) + " ");

        num = -8;
        System.out.print((byte)(num >> 1) + " ");
        System.out.print((byte)(num >> 2) + " ");
        System.out.println((byte)(num >> 3) + " ");
    }
}
