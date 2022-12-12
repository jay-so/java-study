package part25;
class Varargs{
    public static void showAll(String...vargs){
        System.out.println("LEN: " +vargs.length);

        for(String s: vargs)
            System.out.printf(s + '\t');
        System.out.println();
    }

    public static void main(String[]args){
        showAll("Box");
        showAll("Box","Toy");
        showAll("Box","Toy","Apple");
    }
}