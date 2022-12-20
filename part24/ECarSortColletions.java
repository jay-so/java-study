package part24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Car2 implements Comparable<Car2>{
    protected int disp; //배기량

    public Car2(int disp) {
        this.disp = disp;
    }

    @Override
    public String toString() {
        return "cc: " + disp;
    }

    @Override
    public int compareTo(Car2 o) {
        return disp - o.disp;
    }
}

class ECar extends Car2{ //전기 자동차를 표현한 클래스
    private int battery; //배터리

    public ECar(int disp, int battery) {
        super(disp);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "cc: " + disp + ", ba: " + battery;
    }
}

class ECarSortColletions{
    public static void main(String[]args){
        List<ECar> list = new ArrayList<>();
        list.add(new ECar(1200,99));
        list.add(new ECar(3000,55));
        list.add(new ECar(1800,87));
        Collections.sort(list); //정렬

        for(Iterator<ECar> itr = list.iterator(); itr.hasNext();) //출력
            System.out.println(itr.next().toString() + '\t');
    }
}
