package part18;

class Board{ }
class PBoard extends Board{}

public class ClassCast {
    public static void main(String[]args){
        Board pbd1 = new PBoard();
        PBoard pbd2 = new PBoard();

        System.out.println(".. intermediate location ..");
        Board ebd1 = new Board();
        PBoard edb2 = (PBoard) ebd1;
    }
}
