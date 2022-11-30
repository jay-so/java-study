package part26;


interface  Printable{
    void print();
}

class Papers{
    private String con;
    //생성자
    public Papers(String s){
        con = s;
    }

    public Printable getPrinter(){
        return new Printer(); //멤버 클래스 인스턴스 생성 및 반환
    }

    //멤버 클래스 정의
    private class Printer implements Printable{
        public void print(){
            System.out.println(con);
        }
    }
}

class UseMemberInner{
    public static void main(String[]args){
        Papers p = new Papers("서류 내용: 행복합니다.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}
