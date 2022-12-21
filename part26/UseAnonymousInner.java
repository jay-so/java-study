package part26;
interface Printable3{
    void print();
}

class Papers3{
    private String con;

    public Papers3(String con) {
        this.con = con;
    }

    public Printable3 getPrinter(){
        return new Printable3() { //익명 클래스의 정의와 인스턴스 생성
            @Override
            public void print() {
                System.out.println(con);
            }
        };
    }
}

class UseAnonymousInner{
    public static void main(String[]args){
        Papers3 p = new Papers3("서류 내용: 행복합니다.");
        Printable3 prn = p.getPrinter();
        prn.print();
    }
}
