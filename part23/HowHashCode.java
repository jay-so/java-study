package part23;

import java.util.HashSet;

class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString(){
        return model + " : " + color;
    }

    @Override
    public int hashCode(){
        return (model.hashCode() + color.hashCode()) /2;
    }

    @Override
    public boolean equals(Object obj) {
        String m = ((Car)obj).model;
        String c  = ((Car)obj).color;

        if(model.equals(m)&&color.equals(c))
            return true;
        else
            return false;
    }
}


public class HowHashCode {
    public static void main(String[]args){
        HashSet<Car> set = new HashSet<>();
        set.add(new Car("Hy_MD_301","RED"));
        set.add(new Car("Hy_MD_301","BLACK"));
        set.add(new Car("Hy_MD_302","RED"));
        set.add(new Car("Hy_MD_302","WHITE"));
        set.add(new Car("Hy_MD_301","BLACK"));
        System.out.println("인스턴스 수: " + set.size());

        for(Car car: set){
            System.out.println(car.toString()+ '\t');
        }
    }
}
