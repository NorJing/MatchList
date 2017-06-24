import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by dongyan on 24/06/17.
 */

// Run test classes altogether

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MatchListTestByJunit5.class,
        MatchListTest.class
})

public class AllTests {

}
