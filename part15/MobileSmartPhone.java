package part15;
class MobilePhone{
    protected String number; //전화번호

    public MobilePhone(String num) {
        this.number = num;
    }
    public void anser(){
        System.out.println("Hi~ from " + number);
    }
}

class SmartPhone extends MobilePhone{
    private String androidVer; //안드로이드 운영체제 버전

    public SmartPhone(String num, String androidVer) {
        super(num);
        this.androidVer = androidVer;
    }
    public void playApp(){
        System.out.println("App is running in " + androidVer);
    }
}



public class MobileSmartPhone {
    public static void main(String []args){
        SmartPhone phone = new SmartPhone("010-555-777","Nougat");
        phone.anser();
        phone.playApp();
    }

}
