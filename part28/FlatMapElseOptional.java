package part28;

import java.util.Optional;

class ConInfor5{
    Optional<String> phone; //null일 수 있음
    Optional<String> adrs; //null일 수 있음

    public ConInfor5(Optional<String> phone, Optional<String> adrs) {
        this.phone = phone;
        this.adrs = adrs;
    }
    public Optional<String> getPhone(){ return phone;}
    public Optional<String> getAdrs(){return adrs;}
}

public class FlatMapElseOptional {
    public static void main(String[]args){
        Optional<ConInfor5> ci = Optional.of(
                new ConInfor5(Optional.ofNullable(null),Optional.of("Reupblic of Korea"))
        );

        String phone = ci.flatMap(c -> c.getPhone()).orElse("There is no phone number.");
        String addr = ci.flatMap(c -> c.getAdrs()).orElse("There is no phone number.");
        System.out.println(phone);
        System.out.println(addr);
    }
}
