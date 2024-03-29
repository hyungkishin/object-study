package ch2.strategy;

import ch2.Money;
import ch2.Screening;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {

    private double percent;

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
