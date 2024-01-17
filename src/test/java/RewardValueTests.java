import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
     void convert_from_cash_to_miles() {
//        added new test
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        rewardValue.convertFromCashToMiles();
        assertEquals(cashValue / 0.0035, rewardValue.getMilesValue());
    }


    @Test
    void convert_from_miles_to_cash() {
        //        added new test
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        rewardValue.convertFromMilesToCash();
        assertEquals(milesValue * 0.0035, rewardValue.getCashValue());
    }
}
