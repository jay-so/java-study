package part28;

class Friend{ //친구 정보
    private String name;
    private Company cmp; //null 일 수 있음

    public Friend(String name, Company cmp) {
        this.name = name;
        this.cmp = cmp;
    }

    public String getName() {
        return name;
    }

    public Company getCmp() {
        return cmp;
    }
}

class Company{ //'친구 정보'에 속하는 '회사 정보'
    private String cName;
    private ContInfo cInfo; //null일 수 잇음

    public Company(String cName, ContInfo cInfo) {
        this.cName = cName;
        this.cInfo = cInfo;
    }

    public String getcName() {
        return cName;
    }

    public ContInfo getcInfo() {
        return cInfo;
    }
}

class ContInfo{ //'회사 정보'에 속하는 '회사 연락처'
    private String phone; //null일 수 있음
    private String adrs; //null일 수 있음

    public ContInfo(String phone, String adrs) {
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

class NullPointerCastStudy{
    public static void showCompAddr(Friend f){ //친구가 다니는 회사 주소 출력
        String addr = null;

        if(f != null){
            Company com = f.getCmp();

            if(com != null){
                ContInfo info = com.getcInfo();
                if(info != null)
                    addr = info.getAdrs();
            }
        }
        if(addr != null)
            System.out.println(addr);
        else
            System.out.println("There's no address information.");
    }

    public static void main(String[]args){
        ContInfo ci = new ContInfo("321-444-577","Republic of Korea");
        Company cp = new Company("YaHo Co.,Ltd",ci);
        Friend frn = new Friend("LEE SU",cp);
        showCompAddr(frn); //친구가 다니는 회사의 주소 출력
    }
}