import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Created by dongyan on 22/06/17.
 */

public class MatchListTestByJunit5 {

    @Before
    public void prepareTestData(){
        MatchList matchList = new MatchList();
        Match match = new Match(11, "home11", "away11", "2017/10/10 10:10:00");
        matchList.add(match);
    }

    @Test
    @DisplayName("Test MatchList add function")
    public void testMatchListAdd(){
        MatchList matchList = new MatchList();
        Match match = new Match(11, "home11", "away11", "2017/10/10 10:10:00");
        matchList.add(match);

        Assume.assumeFalse(System.getProperty("os.name").contains("Darwin"));
        assertEquals("home11", match.getHomeTeam(), "test home team");
        assertEquals("away11", match.getAwayTeam(), "test sway team");
        assertEquals(11, match.getMatchId(), "test match Id");
        assertEquals("2017/10/10 10:10:00", Utils.changeDateToStringFormat(match.getMatchDate()), "test match date");
        assertEquals(match, matchList.getMatchList().get(0), "test match object");
        assertSame(match, matchList.getMatchList().get(0));
    }
}
