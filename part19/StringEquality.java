package part19;

public class StringEquality {
    public static void main(String[]args){
        String str1 = new String("So Simple");
        String str2 = new String("So Simple");

        // 참조 대상을 비교하는 if - else문
        if(str1 == str2)
            System.out.println("st1,str2 참조 대상은 동일하다.");
        else
            System.out.println("str1,st2의 참조 대상은 다르다.");

        //두 인스턴스 내용 비교하는if-else문
        if(str1.equals(str2))
            System.out.println("str1,str2 내용은 동일하다.");
        else
            System.out.println("str1,str2 내용은 다르다.");
    }

}
