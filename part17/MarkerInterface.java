package part17;

interface  Upper{} // 마커 인터페이스
interface Lower{} // 마커 인터페이스

interface Printerable4{
    String getContents();
}

class Report implements Printerable4,Upper{
    String con;

    public Report(String con) {
        this.con = con;
    }
    @Override
    public String getContents() {
        return con;
    }
}

class Printer3{
    public void printContents(Printerable4 doc){
        if(doc instanceof Upper){ // doc 참조 인스턴스가 Upper 구현한다면
            System.out.println((doc.getContents()).toUpperCase());
        } else if (doc instanceof Lower) { //doc 참조 인스턴스가 Lower 구현한다면
            System.out.println((doc.getContents()).toLowerCase());
        }else{
            System.out.println(doc.getContents());
        }
    }
}

public class MarkerInterface {
    public static void main(String[]args){
        Printer3 prn = new Printer3();
        Report doc = new Report("Simple Funny News!!");
        prn.printContents(doc);
    }
}
