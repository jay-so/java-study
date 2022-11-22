package part28;

import java.util.Optional;

class ContInfor3{
    String phone; //null일 수 있음
    String adrs; //null일 수 있음

    public ContInfor3(String phone, String adrs) {
        this.phone = phone;
        this.adrs = adrs;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdrs() {
        return adrs;
    }
}

public class MapElseOptional {
    public static void main(String[]args){
        Optional<ContInfor3> ci = Optional.of(new ContInfor3(null,"Republic of Korea"));

        String phone = ci.map(c->c.getPhone()).orElse("There is no phone number.");
        String addr = ci.map(c->c.getAdrs()).orElse("There is no address.");
        System.out.println(phone);
        System.out.println(addr);
    }
}
