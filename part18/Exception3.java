package part18;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.print("a/b...a?");
        int n1 = kb.nextInt(); //입력 오류 발생 가능성
        System.out.print("a/b ... b?");
        int n2 = kb.nextInt(); //입력 오류 발생 가능성
        System.out.printf("%d / %d = %d",n1,n2,n1/n2);
        System.out.println("Good bye ~~~!");
    }
}
