package part19;
class StringEquality{
    public static void main(String[]args){
        String str1 = new String("So Simple");
        String str2 = new String("So Simple");

        //참조 대상을 비교하는 if ~ else문
        if(str1 == str2)
            System.out.println("str1과 str2는 참조 대상이 서로 동일합니다.");
        else
            System.out.println("str1과 str2는 참조 대상이 서로 다르다.");

        //두 인스턴스 내용을 비교하는 if ~ elseans
        if(str1.equals(str2))
            System.out.println("str1과 str2는 내용이 동일하다.");
        else
            System.out.println("str1과 str2는 내용이 다르다.");
    }
}