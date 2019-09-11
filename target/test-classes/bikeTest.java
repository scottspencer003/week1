import org.junit.* ;
import static org.junit.Assert.* ;
public class SubscriptionTest {
    @Test
    public void testReturnEuro() {
        Subscription S = new Subscription(200,2) ;
        assertTrue(S.pricePerMonth() == 1.0) ;
    }
    @Test
    public void testRoundUp() {
        Subscription subscription = new Subscription(200,3) ;
        assertTrue(subscription.pricePerMonth() == 0.67) ;
    }
}