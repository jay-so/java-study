package part19;

public class StringEquality {
    public static void main(String[]args){
        String str1 = new String("So Simple");
        String str2 = new String("So Simple");


        if(str1 == str2)
            System.out.println("st1,str2 참조 대상은 동일하다.");
        else
            System.out.println("str1, st2의 참조 대상은 다르다.");

        if(str1.equals(str2))
            System.out.println("str1,str2 내용은 동일하다.");
        else
            System.out.println("str1,str2 내용은 다르다.");
    }

}
