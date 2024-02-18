package ch2.strategy;

import ch2.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {

    // 요일
    private final DayOfWeek dayOfWeek;

    // 시작 시간
    private final LocalTime startTime;

    // 종료 시간
    private final LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * 인자로 전달된 Screening 의 상영 요일이 dayOfWeek 과 같고 상영 시작 시간이 startTime 과 endTime 사이에 있을 경우에는 true 를
     * 그렇지 않을 경우에는 false 를 반환한다
     */
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                !startTime.isAfter(screening.getStartTime().toLocalTime()) &&
                !endTime.isBefore(screening.getStartTime().toLocalTime());
    }
    
}
