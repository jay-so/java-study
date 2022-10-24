package part9.animal;

public class Dog {
    /*
    public void makeCat() {

        //Cat은 public으로 선언되었으므로 어디서든 인스턴스 생성 가능
        part9.zoo.Cat yang = new part9.zoo.Cat();
    }

    public void makeDuck(){
        //Duck은 default로 선언되었으므로 이 위치에서 인스턴스 생성 불가
        part9.zoo.Duck quck = new part9.zoo.Duck(); //컴파일 오류 발생 문장
    }


    }
     */
    public void welcome(part9.zoo.Cat c){
        c.makeSound(); //호출 가능! 컴파일 성공!
      //  c.makeHappy(); //호출 불가! 컴파일 오류!
    }
}
