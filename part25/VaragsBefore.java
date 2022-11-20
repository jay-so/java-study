package part25;

public class VaragsBefore {
    public static void showAll(String[]vars){
        System.out.println("LEN: " + vars.length);

        for(String s:vars)
            System.out.print(s + '\t');

        System.out.println('\n');
    }

    public static void main(String[]args){
        showAll(new String[]{"Box"});
        showAll(new String[]{"Box","Toy"});
        showAll(new String[]{"Box","Toy","Apple"});
    }
}
