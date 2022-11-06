package part18;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);

        try{
            System.out.print("a/b...a?");
            int n1 = kb.nextInt();
            System.out.print("a/b...b?");
            int n2 = kb.nextInt();
            //예외 발생 지점
            System.out.printf("%d / %d = %d\n",n1,n2,n1/n2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Good Bye ~~~!");
    }
}
