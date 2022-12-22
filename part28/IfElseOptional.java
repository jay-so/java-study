package part28;

class ContInfo2{
     String phone; //null일 수 있음
     String adrs; //null일 수 있음

    public ContInfo2(String phone, String adrs) {
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

class IfElseOptional{
    public static void main(String[]args){
        ContInfo2 ci = new ContInfo2(null,"Republic of Korea");
        String phone;
        String addr;

        if(ci.phone != null)
            phone = ci.getPhone();
        else
            phone = "There is no phone number.";

        if(ci.adrs != null)
            addr = ci.getAdrs();
        else
            addr = "There is no address.";


        System.out.println(phone);
        System.out.println(addr);
    }
}
