package part25;
class VarargsBefor{
    public static void showAll(String[]vargs){
        System.out.println("LEN: " + vargs.length);
        for(String s: vargs)
            System.out.printf(s + '\t');

        System.out.println('\n');
    }

    public static void main(String[]args){
        showAll(new String[]{"Box"});
        showAll(new String[]{"Box","Toy"});
        showAll(new String[]{"Box","Toy","Apple"});
    }
}
