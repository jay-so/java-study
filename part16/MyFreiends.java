package part16;

class UnivFreind{
    private String name;
    private String major;
    private String phone;

    public UnivFreind(String name, String major, String phone) {
        this.name = name;
        this.major = major;
        this.phone = phone;
    }
    public void showIno(){
        System.out.println("이름 " +name);
        System.out.println("전공: " + major);
    }
}

class CompFriend{
    private String name;
    private String department;
    private String phone;

    public CompFriend(String name, String department, String phone) {
        this.name = name;
        this.department = department;
        this.phone = phone;
    }
    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("부서: " + department);
        System.out.println("전화: " + phone);
    }
}

public class MyFreiends {
    public static void main(String[]args){
        UnivFreind[] ufrns = new UnivFreind[5];
        int ucnt = 0;

        CompFriend[] cfns = new CompFriend[5];
        int ccnt = 0;

        ufrns[ucnt++] = new UnivFreind("LEE","Computer","010-333-555");
        ufrns[ucnt++] = new UnivFreind("SED","Electronics","010-222-444");

        cfns[ccnt++] = new CompFriend("YOON","R&D 1", "02-123-999");
        cfns[ccnt++] = new CompFriend("PARK", "R&D 2","02-321-777");

        for(int i = 0;i<ucnt;i++){
            ufrns[i].showIno();
            System.out.println();
        }

        for(int i = 0; i<ccnt;i++){
            cfns[i].showInfo();
            System.out.println();
        }
    }
}
