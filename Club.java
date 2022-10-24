import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
/**
 * Write a description of class Club here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Club
{
    // instance variables - replace the example below with your own
    private String clubname;
    private int GoalsScored;
    private int GoalsConceded;
    private int GoalDiff;
    private int Points=0, homeindex=0, awayindex=0;
    
    private String clubcheck, homeclub, awayclub;
    int clubnumber =0;
  //private Player playerclass;
      int ind =0;
      
      
      //private ArrayList<Matches> Matches = new ArrayList<Matches>(); 
      //private Matches Mat = new Matches();
      
    /**
     * Constructor for objects of class Club
     */
    
    public Club(String cname){
        clubname = cname;
    }
    public Club(String Cname, int gs, int gc, int gd, int point)
    {
        // initialise instance variables
        clubname = Cname;
        GoalsScored = gs;
        GoalsConceded = gc;
        GoalDiff = gd;
        Points = point;
        //playerclass = new Player(this.Name, this.Date, this.Age, this.Height, PlaysFor, this.Id);
        //playerclass.getPlayer();
        //addPlayer(playerclass);
        
    }
    
    
    // Display clb details
    /**
       * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String setName(String cname){
        clubname = cname;
        return clubname;
    }
    
    public String getName()
    {
        // put your code here
        return clubname;
    }
    
    public int GoalScored(int goalsdone)
    {
        GoalsScored = GoalsScored + goalsdone;
        return GoalsScored;
    }
    
    public int goalscor(){
        return GoalsScored;
    }
    
    public int GOalConceded(int goalrecieved){
        GoalsConceded = GoalsConceded + goalrecieved;
        return GoalsConceded;
    }
    
    public int goalcon(){
        return GoalsConceded;
    }
    
    public int goaldiff(){
        GoalDiff = GoalsScored - GoalsConceded;
        return GoalDiff;
    }
    
    public int changepoints(int hg, int ag){
        /* Need to complete */
        if(hg>ag){
            Points = Points + 3;
            return Points;
        }
        else if (hg==ag){
            Points = Points + 1;
            return Points;
        }
        else{
           return Points; 
        }
    }
    
    public int getpoints(){
        return Points;
    }
    
    
    /*Method to find if a player is part of a club.
       Initially iterating the arraylist player using a forloop 
       using the club method from player lass getting the club name
       if returned club name is same as input club name then club players name are parsed for finding the player within the club
    public void playercheck(String name, String club){
        for(Player pname: player){
            clubcheck = pname.club();
            if(clubcheck.equals( club)){
                String plname = pname.playern();
                if(plname.equals( name)){
                    System.out.println("Player is part of the club" + plname);
                    break;
                }
                else{
                    System.out.println("Player is not part of the club" + plname);
                    
                }
            }
            else{
                System.out.println("Player is not part of the club" +club);
                System.out.println("Player is not part of the club is" +clubcheck);
                continue;
                
            }
        }
    }
    
    public void avgage(){
        int index = 0;
        int averageage = 0;
        for(Player pname: player){
            
            index = index +1;
            int age1 = pname.age();
            averageage = averageage+age1;
            
        }
        averageage = averageage / index;
        System.out.println("Average age of the squad is" + averageage);
    }
    
    public void avghieght(){
        int index = 0;
        int averageheight = 0;
        for(Player pname: player){
            
            index = index +1;
            int height1 = pname.height();
            averageheight = averageheight+height1;
            
        }
    }*/
    @Override
    public String toString() {
        return "Club{" +
                "Name of club='" + clubname+ '\'' +
                ", Goals done=" + GoalsScored + 
                ", Goals conceeded=" + GoalsConceded + 
                 ", Points=" + Points + 
                '}';
    }
    
    }
    

