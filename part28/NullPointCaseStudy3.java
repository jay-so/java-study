package part28;

import java.util.Optional;

class Friend5{
    String name;
    Optional<Company5> cmp; //null일 수 있음

    public Friend5(String name, Optional<Company5> cmp) {
        this.name = name;
        this.cmp = cmp;
    }

    public String getName() {
        return name;
    }

    public Optional<Company5> getCmp() {
        return cmp;
    }
}

class Company5{
    String cName;
    Optional<ConInfo6> cInfo; //null일 수 있음

    public Company5(String cn, Optional<ConInfo6> cInfo) {
        cName = cn;
        this.cInfo = cInfo;
    }

    public String getName() {
        return cName;
    }

    public Optional<ConInfo6> getcInfo() {
        return cInfo;
    }
}

class ConInfo6{
    Optional<String> phone; //null일 수 있음
    Optional<String> adrs; //null일 수 있음

    public ConInfo6(Optional<String> ph, Optional<String> ad) {
        this.phone = ph;
        this.adrs = ad;
    }

    public Optional<String> getPhone() {
        return phone;
    }

    public Optional<String> getAdrs() {
        return adrs;
    }
}

public class NullPointCaseStudy3 {
    public static void showCompAddr(Optional<Friend5> f){
        String addr = f.flatMap(Friend5::getCmp).flatMap(Company5::getcInfo).flatMap(ConInfo6::getAdrs).orElse("There's no address information");

    }

    public static void main(String[]args){
        Optional<ConInfo6> ci = Optional.of(new ConInfo6(Optional.ofNullable(null),Optional.of("Republic of Korea")));
        Optional<Company5> cp = Optional.of(new Company5("YaHo Co,Ltd.",ci));
        Optional<Friend5> frn = Optional.of(new Friend5("LEE SU",cp));
        showCompAddr(frn);

    }
}
