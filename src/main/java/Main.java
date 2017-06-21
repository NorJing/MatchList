/**
 * Created by Percy on 21/06/17.
 */

public class Main {

    public static void main(String args[])
    {
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

        System.out.println("After sort. List from earliest to latest by time and match ID.");
        matchList.sortByMatchDateAndMatchIdDescending();
        System.out.println(matchList.toString());

        System.out.println("List by Match ID from biggest to smallest.");
        matchList.sortByMatchIdDescending();
        System.out.println(matchList.toString());
    }
}
