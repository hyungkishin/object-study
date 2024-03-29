package ch2;

import ch2.strategy.DiscountPolicy;

import java.time.Duration;

public class Movie {

    private String title;

    private Duration runningTime;

    private Money fee;

    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    // discountPolicy 에게 calculateDiscountAmount 메세지를 전송해 할인 요금을 반환받는다.
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    public void changeDiscountPolicy (DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

}
