import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Percy on 19/06/17.
 */
public class MatchList {
    private ArrayList<Match> matchList;

    public MatchList(){
        this.matchList = new ArrayList<Match>();
    }

    public ArrayList<Match> getMatchList(){
        return this.matchList;
    }

    public void add(Match match){
        this.getMatchList().add(match);
    }

    public String toString(){
        String output = "";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        for(Match match : this.getMatchList()){
            output = output.concat(match.getMatchId() + " " +
                    match.getHomeTeam() + " vs " +
                    match.getAwayTeam() + " " +
                    dateFormat.format(match.getMatchDate())).concat("\n");
        }
        return output;
    }

    public void sortByMatchDateAndMatchIdDescending(){
        Collections.sort(this.getMatchList(), new Comparator<Match>() {
            @Override
            public int compare(Match o1, Match o2) {
                if(o1.getMatchDate().compareTo(o2.getMatchDate()) > 0){
                    return 1;
                }else if(o1.getMatchDate().compareTo(o2.getMatchDate()) == 0){
                    if(o1.getMatchId() > o2.getMatchId()){
                        return 1;
                    }
                }
                return -1;
            }
        });
    }

    public void sortByMatchIdDescending(){
        Collections.sort(this.getMatchList(), new Comparator<Match>() {
            @Override
            public int compare(Match o1, Match o2) {
                return Integer.compare(o2.getMatchId(), o1.getMatchId());
            }
        });
    }
}
