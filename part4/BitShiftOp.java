package part4;

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
