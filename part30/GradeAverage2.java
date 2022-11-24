package part30;

import java.util.Arrays;
import java.util.stream.IntStream;

class ReportCard2{
    private int kor; //국어 점수
    private int eng; //영어 점수
    private int math; //수학 점수

    public ReportCard2(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}
public class GradeAverage2 {
    public static void main(String[]args){
        ReportCard2[] cards = {
                new ReportCard2(70,80,90),
                new ReportCard2(90,80,70),
                new ReportCard2(80,80,80)
        };


        Arrays.stream(cards)
                .flatMapToInt(r-> IntStream.of(r.getKor(),r.getEng(),r.getMath()))
                        .average()
                        .ifPresent(avg -> System.out.println("avg. " + avg));
    }
}
