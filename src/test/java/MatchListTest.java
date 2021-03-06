/**
 * Created by Percy on 21/06/17.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class MatchListTest {

    @Test
    public void testSortByMatchDateAndMatchId(){
        String outputExpect = "5 home5 vs away5 2012/10/25 20:45:00\n" +
                "6 home6 vs away6 2012/10/25 20:45:00\n" +
                "2 home2 vs away2 2013/08/25 17:45:00\n" +
                "1 home3 vs away3 2013/11/25 18:45:00\n" +
                "3 home1 vs away1 2013/11/25 18:45:00\n" +
                "4 home4 vs away4 2014/09/23 17:45:00\n";

        Match match1 = new Match(3, "home1", "away1", "2013/11/25 18:45:00");
        Match match2 = new Match(2, "home2", "away2", "2013/08/25 17:45:00");
        Match match3 = new Match(1, "home3", "away3", "2013/11/25 18:45:00");
        Match match4 = new Match(4, "home4", "away4", "2014/09/23 17:45:00");
        Match match5 = new Match(5, "home5", "away5", "2012/10/25 20:45:00");
        Match match6 = new Match(6, "home6", "away6", "2012/10/25 20:45:00");

        MatchList matchList = new MatchList();
        matchList.add(match1);
        matchList.add(match2);
        matchList.add(match3);
        matchList.add(match4);
        matchList.add(match5);
        matchList.add(match6);
        matchList.sortByMatchDateAndMatchIdDescending();
        String output = matchList.toString();
        assertEquals(outputExpect, output);
    }

    @Test
    public void testSortByMatchIdDescending(){
        String outputExpect = "6 home6 vs away6 2012/10/25 20:45:00\n" +
                "5 home5 vs away5 2012/10/25 20:45:00\n" +
                "4 home4 vs away4 2014/09/23 17:45:00\n" +
                "3 home1 vs away1 2013/11/25 18:45:00\n" +
                "2 home2 vs away2 2013/08/25 17:45:00\n" +
                "1 home3 vs away3 2013/11/25 18:45:00\n";

        Match match1 = new Match(3, "home1", "away1", "2013/11/25 18:45:00");
        Match match2 = new Match(2, "home2", "away2", "2013/08/25 17:45:00");
        Match match3 = new Match(1, "home3", "away3", "2013/11/25 18:45:00");
        Match match4 = new Match(4, "home4", "away4", "2014/09/23 17:45:00");
        Match match5 = new Match(5, "home5", "away5", "2012/10/25 20:45:00");
        Match match6 = new Match(6, "home6", "away6", "2012/10/25 20:45:00");

        MatchList matchList = new MatchList();
        matchList.add(match1);
        matchList.add(match2);
        matchList.add(match3);
        matchList.add(match4);
        matchList.add(match5);
        matchList.add(match6);
        matchList.sortByMatchIdDescending();
        String output = matchList.toString();
        assertEquals(outputExpect, output);
    }

    @Test
    public void testMatchListAdd(){
        MatchList matchList = new MatchList();
        Match match = new Match(10, "home10", "away10", "2017/10/10 10:10:00");
        matchList.add(match);
        assertEquals("home10", match.getHomeTeam());
        assertEquals("away10", match.getAwayTeam());
        assertEquals(10, match.getMatchId());
        assertEquals("2017/10/10 10:10:00", Utils.changeDateToStringFormat(match.getMatchDate()));
        assertEquals(match, matchList.getMatchList().get(0));
        assertSame(match, matchList.getMatchList().get(0));
        assertThat("match is the match", match, is(matchList.getMatchList().get(0)));
    }
}
