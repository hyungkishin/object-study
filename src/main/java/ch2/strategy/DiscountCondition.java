package ch2.strategy;

import ch2.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
