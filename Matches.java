import java.util.ArrayList;
import java.util.Random;            
/**
 * Write a description of class Matches here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Matches
{
    // instance variables - replace the example below with your own
    private String HomeTeam;
    private String AwayTeam;
    private String Place;
    private String DateTime;
    private int homeplayer=0, awayplayer =0;
    public ArrayList<Player> Homeplayerlist, homeeleven;
    private ArrayList<Player> Awayplayerlist, awayeleven;
    private int homegoals=0, awaygoals=0;
    private Random rand;
    private String Result;
    /**
     * Constructor for objects of class Matches
     */
    public Matches(){
        Homeplayerlist = new ArrayList<Player>();
        Awayplayerlist = new ArrayList<Player>();
        homeeleven = new ArrayList<Player>();
        awayeleven = new ArrayList<Player>();
    }
    
    public Matches(String home, String away, String dt, String place)
    {
        // initialise instance variables
        
         Random rand = new Random();
        this.HomeTeam = home;
        this.AwayTeam = away;
        this.DateTime = dt;
        this.Place = place;
        this.homegoals = rand.nextInt(6);
        this.awaygoals = rand.nextInt(6);
        this.Result = " ";
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Matches setmatch(String home, String away, String dt, String place,int hg, int ag)
    {
        // put your code here
        Random rand = new Random();
        this.HomeTeam = home;
        this.AwayTeam = away;
        this.DateTime = dt;
        this.Place = place;
        this.homegoals = rand.nextInt(6);
        this.awaygoals = rand.nextInt(6);
        return this;
    }
    
    public Matches getmatch()
    {
        // put your code here
        return this;
    }
    
    public String getdate(){
        return DateTime;
    }
    
    
    public String getPlace(){
        return Place;
    }
    
    
    public String hometeam(){
        return HomeTeam;
    }
    
    
    public String awayteam(){
        return AwayTeam;
    }
    
    
    public void playingeleven(ArrayList<Player> playerlist, String homeplayerclub, String awayplayerclub){
        Homeplayerlist.clear();
        Awayplayerlist.clear();
        for(Player p : playerlist){
             String playerclub=p.club();
             p.resetgoals();
             boolean playerselection = p.select();
             if(playerclub.equals(homeplayerclub) && playerselection == true ){
                 Homeplayerlist.add(p);
                 homeplayer+=1;
             }
             else if (playerclub.equals(awayplayerclub) && playerselection == true ){
                 Awayplayerlist.add(p);
                 awayplayer+=1;
             }
             
        }
        
    }  
    // Random number is used to get a player data randomly and add goal count for that player.
    public void GoalScorers(int hg, int ag,String homeplayerclub, String awayplayerclub, ArrayList<Player> playerlist){
        for(int iterh =0 ; iterh<hg ; iterh++){
           Random rand = new Random();
           int valh = rand.nextInt(10);
           Player Plh = Homeplayerlist.get(valh);
           Plh.addgoal(1);
           String playernameh = Plh.playern();
           for(Player p : playerlist){
               
               if(playernameh.contains(p.playern())){
                   p.addgoal(1);            
               }
           }
           System.out.println("Player scored HOME - " +Homeplayerlist.get(valh).displaygoal());
           System.out.println("Player scored HOME - " +Homeplayerlist.get(valh).playern());
        }
        for(int itera =0 ; itera<ag ; itera++){
           Random rand = new Random();
           int vala = rand.nextInt(10);
           Player Pla = Awayplayerlist.get(vala);
           Pla.addgoal(1);
           String playernamea = Pla.playern();
           for(Player p : playerlist){
               
               if(playernamea.contains(p.playern())){
                   p.addgoal(1);            
               }
           }
           System.out.println("Player scored AWAY - " +Awayplayerlist.get(vala).displaygoal());
           System.out.println("Player scored AWAY - " +Awayplayerlist.get(vala).playern());
        }
        
        for(Player p: Homeplayerlist){
            System.out.println("Data -" +p);
        }
        
        for(Player p: Awayplayerlist){
            System.out.println("Data -" +p);
        }
        
                
    }
    
    public int goalsH(){
        return homegoals;
    }
    public int goalsA(){
        return awaygoals;
    }
    
    public void decider(int homeg, int awayg, String homeclub, String awayclub){
        if(homeg>awayg){
            System.out.println(homeclub + " Wins");
            Result = homeclub;
        }
        else if (homeg<awayg){
            System.out.println(awayclub + " Wins");
            Result = awayclub;
            
        }
        else{
            System.out.println("The game resulted in a draw");
            Result = "draw";
        }
    }
        
    @Override
    public String toString() {
        return "Match{" +
                "Home='" + HomeTeam + '\'' +
                ", Away=" + AwayTeam + '\'' +
                ", HomeTeamGoals=" + homegoals + '\'' +
                ", AwayTeamGoals=" + awaygoals +
                '}';
    }
}
