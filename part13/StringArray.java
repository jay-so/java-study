package part13;

public class StringArray {
    public static void main(String[]args){
        String[] sr = new String[7];
        sr[0] = new String("Java");
        sr[1] = new String("Java");
        sr[2] = new String("Java");
        sr[3] = new String("Java");
        sr[4] = new String("Java");
        sr[5] = new String("Java");
        sr[6] = new String("Java");

        int cnum = 0;
        for(int i = 0; i< sr.length; i++)
            cnum += sr[i].length();

        System.out.println("총 문자의 수: " + cnum);
    }
}
