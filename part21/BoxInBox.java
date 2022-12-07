package part21;
class Box8<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}
class BoxInBox{
    public static void main(String[]args){
        Box8<String> sBox = new Box8<>(); //문자열을 담는 String형 박스를 생성
        sBox.set("I am so happy.");

        Box8<Box8<String>> wBox = new Box8<>();//문자열을 담은 String형 박스를 다시 박스에 담음
        wBox.set(sBox);

        Box8<Box8<Box8<String>>> zBox = new Box8<>(); //3번째로 박스에 담음
        zBox.set(wBox);

        System.out.println(zBox.get().get().get()); //3번째로 담은 박스를 3번 열어 그 내용물을 꺼냄
    }
}