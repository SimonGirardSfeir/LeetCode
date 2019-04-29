import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {

    @Test
    public void twoSum() {

        assertThat(TwoSum.twoSum(new int[]{2,7,15,11}, 9)).isEqualTo(new int[]{0,1});

        assertThat(TwoSum.twoSum(new int[]{5,2,47,107,28}, 75)).isEqualTo(new int[]{2,4});
    }

    @Test
    public void twoSumWrongValue() {

        assertThat(TwoSum.twoSum(new int[]{2,8,15,11}, 9)).isNullOrEmpty();
    }
}