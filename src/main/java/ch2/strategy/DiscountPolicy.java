package ch2.strategy;

import ch2.Money;
import ch2.Screening;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);

}
