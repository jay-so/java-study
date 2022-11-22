package part29;

import java.util.ArrayList;
import java.util.List;

class ToyPriceInfo{ //장난감 모델 별 가격 정보
    private String model;  //모델 명
    private int price; //가격

    public ToyPriceInfo(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
public class ToyStream {
    public static void main(String[]args){
        List<ToyPriceInfo> ls = new ArrayList<>();
        ls.add(new ToyPriceInfo("GUN_LR_45",200));
        ls.add(new ToyPriceInfo("TEDDY_BEAR_S_014",350));
        ls.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719",550));

        int sum = ls.stream()
                .filter(p ->p.getPrice() < 500)
                .mapToInt(t -> t.getPrice())
                .sum();
        System.out.println("sum = " + sum);
    }
}
