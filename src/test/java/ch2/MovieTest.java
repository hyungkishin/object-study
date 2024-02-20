package ch2;

import ch2.strategy.NoneDiscountPolicy;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void test() {
        Movie 스타워즈 = new Movie("스타워즈",
                Duration.ofMinutes(210),
                Money.wons(10000),
                new NoneDiscountPolicy()
        );
        
        System.out.println("스타워즈 = " + 스타워즈);
    }

}