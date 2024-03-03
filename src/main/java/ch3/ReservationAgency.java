package ch3;

public class ReservationAgency {

    /**
     * reserve 메서드는 크게 두부분으로 나눌 수 있다.
     * 첫 번째는 DiscountCondition 에 대해 루프를 돌면서 할인 가능 여부를 확인 하는 for 문 이고,
     * 두 번째는 discountable 변수의 값을 체크하고 적절한 할인 정책에 따라, 예매 요금을 계산하는 if 문 이다.
     * @param screening
     * @param customer
     * @param audienceCount
     * @return
     */
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Movie movie = screening.getMovie();

        boolean discountable = false;

        for (DiscountCondition condition : movie.getDiscountConditions()) {
            if (condition.getType() == DiscountConditionType.PERIOD) {
                discountable = screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek())
                        && condition.getStartTime().compareTo(screening.getWhenScreened().toLocalTime()) <= 0
                        && condition.getEndTime().compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
            } else {
                discountable = condition.getSequence() == screening.getSequence();
            }

            if (discountable) {
                break;
            }
        }

        Money fee;

        if (discountable) {
            Money discountAmount = Money.ZERO;

            switch (movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                    discountAmount = movie.getDiscountAmount();
                    break;
                case PERCENT_DISCOUNT:
                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
                    break;
                case NONE_DISCOUNT:
                    discountAmount = Money.ZERO;
                    break;
            }

            fee = movie.getFee().minus(discountAmount);
        } else {
            fee = movie.getFee();
        }

        return new Reservation(customer, screening, fee, audienceCount);
    }

}
