import java.util.Date;

/**
 * Created by Percy on 19/06/17.
 */
public class Match {
    private int matchId;
    private String homeTeam;
    private String awayTeam;
    private Date matchDate;

    public Match(int matchId, String homeTeam, String awayTeam, String matchDate){
        this.matchId = matchId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.matchDate = Utils.parseDate(matchDate);
    }

    public Match(int matchId, String homeTeam, String awayTeam, Date matchDate){
        this.matchId = matchId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.matchDate = matchDate;
    }

    public int getMatchId(){
        return matchId;
    }

    public void setMatchId(int matchId){
        this.matchId = matchId;
    }

    public String getHomeTeam(){
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam){
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam(){
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam){
        this.awayTeam = awayTeam;
    }

    public Date getMatchDate(){
        return matchDate;
    }

    public void setMatchDate(Date matchDate){
        this.matchDate = matchDate;
    }

}
