package part10;


import java.time.LocalDate;

public class DateOfExecution {
    static String data;

    static {
        LocalDate nDate = LocalDate.now();
        data = nDate.toString();
    }


    public static void main(String[]args){
        System.out.println(data);
    }
}
