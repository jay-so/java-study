package part11;

public class StringInst {
    public static void showString(String str){
        System.out.println(str);
        System.out.println(str.length());
    }


    public static void main(String[]args){
        String str1 = "Simple String";
        String str2 = "The Best String";

        System.out.println(str1);
        System.out.println(str1.length()); // length의 반환 값을 인자로 전달
        System.out.println();

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("Funny String");
    }
}
