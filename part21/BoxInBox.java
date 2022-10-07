package part21;

public class BoxInBox {
    public static void main(String[]args){
        Box3<String> sBox = new Box3<>();
        sBox.set("I am so happy");

        Box3<Box3<String>> wBox = new Box3<>();
        wBox.set(sBox);

        Box3<Box3<Box3<String>>> zBox = new Box3<>();
        zBox.set(wBox);

        System.out.println(zBox.get().get().get());
    }
}
