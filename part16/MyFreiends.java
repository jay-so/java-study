package part16;

class UnivFreind{ //대학 동창
    private String name; //이름
    private String major; //전공
    private String phone; //번호

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

class CompFriend{ //직장 동료
    private String name; //이름
    private String department; //부서
    private String phone; //번호

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
        //대학 동창의 관리를 위한 배열과 변수
        UnivFreind[] ufrns = new UnivFreind[5];
        int ucnt = 0;

        //직장 동료의 관리를 위한 배열과 변수
        CompFriend[] cfns = new CompFriend[5];
        int ccnt = 0;

        //대학 동창의 정보 저장
        ufrns[ucnt++] = new UnivFreind("LEE","Computer","010-333-555");
        ufrns[ucnt++] = new UnivFreind("SED","Electronics","010-222-444");

        //직장 동료의 정보 저장
        cfns[ccnt++] = new CompFriend("YOON","R&D 1", "02-123-999");
        cfns[ccnt++] = new CompFriend("PARK", "R&D 2","02-321-777");

        // 모든 동창 및 동료의 정보 전체 출력
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
