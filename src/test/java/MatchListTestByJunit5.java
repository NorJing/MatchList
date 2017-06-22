import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Created by dongyan on 22/06/17.
 */

public class MatchListTestByJunit5 {

    @Test
    @DisplayName("Test MatchList add function")
    public void testMatchListAdd(){
        MatchList matchList = new MatchList();
        Match match = new Match(11, "home11", "away11", "2017/10/10 10:10:00");
        matchList.add(match);

        assertEquals("home11", match.getHomeTeam(), "test home team");
        assertEquals("away11", match.getAwayTeam());
        assertEquals(11, match.getMatchId());
        assertEquals("2017/10/10 10:10:00", Utils.changeDateToStringFormat(match.getMatchDate()));
        assertEquals(match, matchList.getMatchList().get(0));
        assertSame(match, matchList.getMatchList().get(0));
    }
}
