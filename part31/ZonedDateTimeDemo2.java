package part31;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class ZonedDateTimeDemo2 {
    public static void main(String[]args){
        //현재 시각
        LocalDateTime today = LocalDateTime.of(2020,4,25,11,20);

        //항공편1의 출발 시간
        LocalDateTime fight1 = LocalDateTime.of(2020,5,14,11,15);

        //항공편2의 출발 시간
        LocalDateTime fight2 = LocalDateTime.of(2020,5,13,15,30);

        //빠른 항공편을 선택하는 과정
        LocalDateTime myFight;
        if(fight1.isBefore(fight2))
            myFight = fight1;
        else
            myFight = fight2;

        //빠른 항공편의 비행 탑승까지 남은 날짜 계산
        Period day = Period.between(today.toLocalDate(),myFight.toLocalDate());

        //빠른 항공편의 비행 탑승까지 남은 시간 계산
        Duration time = Duration.between(today.toLocalTime(),myFight.toLocalDate());

        //비행 탑승까지 남은 날짜와 시간 출력
        System.out.println(day);
        System.out.println(time);
    }
}
