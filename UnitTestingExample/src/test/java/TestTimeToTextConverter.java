import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

// why do we write test cases as we write code?
// keeps you doing what is needed. YAGNI - you ain't gonna need it
// reduces errors later and now
// more is tested
// tests provide examples of how to use the classes
// naming
// you have an automatable test suite
// TDD - test driven development
// GUTS - good unit tests
public class TestTimeToTextConverter {

    private TimeToTextConverter converter;
    @Test
    public void canDoMidnight(){
        // arrange
        converter = new TimeToTextConverter();
        // act
        String timeAsText = converter.convertTimeToText(LocalTime.MIDNIGHT);
        // assert
        Assert.assertEquals("midnight", timeAsText);
    }

    @Test
    public void canDoMidday() {
        converter = new TimeToTextConverter();
        String timeAsText = converter.convertTimeToText(LocalTime.NOON);
        Assert.assertEquals("midday", timeAsText);
    }


}
