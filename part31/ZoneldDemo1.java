package part31;

import java.time.ZoneId;

public class ZoneldDemo1 {
    public static void main(String[]args){
        ZoneId paris = ZoneId.of("Europe/Paris");
        System.out.println(paris);
    }
}
