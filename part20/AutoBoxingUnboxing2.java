package part20;
class AutoBoxingUnboxing2{
    public static void main(String[]args){
        Integer num = 10;
        num ++; //오토 박싱, 오토 언박싱이 동시에 진행된다.
        System.out.println(num);

        num += 3; //오토 박싱, 오토 언박싱이 동시에 진행된다.
        System.out.println(num);

        int r = num + 5; //오토 언박싱이 진행됩니다.
        Integer rObj = num -5; //오토 언박싱이 진행 됩니다.
        System.out.println(r);
        System.out.println(rObj);
    }
}
