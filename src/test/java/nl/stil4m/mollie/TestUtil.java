package nl.stil4m.mollie;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class TestUtil {

    public static final String VALID_API_KEY = "test_35Rjpa5ETePvpeQVU2JQEwzuNyq8BA";

    public static final Long TEST_TIMEOUT = 2000L;
    
    public static void assertWithin(Date before, Date target, Date after, Long additionalSpan) {
        long beforeTime = before.getTime() - (before.getTime() % 1000) - additionalSpan;
        long afterTime = after.getTime() - (after.getTime() % 1000) + additionalSpan;
        
        assertThat(new Date(beforeTime), lessThanOrEqualTo(target));
        assertThat(target, lessThanOrEqualTo(new Date(afterTime)));
    }
}
