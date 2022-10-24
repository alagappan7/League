import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Write a description of class League here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class League
{
    // instance variables - replace the example below with your own
    private String leaguename;
    private Club club;
    //private Club clubtable;
    private Matches M;
    private ArrayList<Matches> MatList= new ArrayList<Matches>();
    private ArrayList<Club> LeagueTable = new ArrayList<Club>();
    private ArrayList<Club> PrintTable = new ArrayList<Club>();
    private ArrayList<Club> FinalTable = new ArrayList<Club>();
    private             ArrayList<String> ClubNames = new ArrayList<String>();
    int GoalVal, GoalCal, GoalDal,Points;
    private FileWriter myWriter;
    private String op = "Team Name   Goalsdone  GoalsConceeded   Points";
    /**
     * Constructor for objects of class League
     */
    public League()
    {
        // initialise instance variables
        M = new Matches();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setleaguename(String name)
    {
        // put your code here
        leaguename = name;
    }
    
    public String getleaguename(){
        return leaguename;
    }
    
    public void addclub(ArrayList<String> allclubs){
        for(String clubdet : allclubs){
        
        club = new Club(clubdet);
        //System.out.println("Club recieved is " + clubdet);
        LeagueTable.add(club);
    }
        
    }
    
    
    public ArrayList<Matches> generatefixture(ArrayList<String> allclubs){
        for(int j =0;j<allclubs.size();j++){
        String homeclub = allclubs.get(j);
        for(int k=0;k<allclubs.size();k++){
            String awayclub = allclubs.get(k);
            if(!homeclub.equals(awayclub)){
                M = new Matches(homeclub, awayclub, "22041999","Newcastle");
                
                System.out.println(homeclub + "vs" +awayclub);
                MatList.add(M);
                
            }
            }
        }   
        
       
           return MatList;
}

    public void leaguetable(){
        for(Matches ma : MatList){
            System.out.println(ma);
                String home = ma.hometeam();
                String away = ma.awayteam();
                int homegoal = ma.goalsH();
                int awaygoal = ma.goalsA();
                for(Club c : LeagueTable){
                String clname = c.getName();
                if(clname.equals(home)){    
                GoalVal = c.GoalScored(homegoal);
                GoalCal = c.GOalConceded(awaygoal);
                GoalDal = c.goaldiff();
                Points = c.changepoints(homegoal, awaygoal);
                }
                else if(clname.equals(away)){
                GoalVal = c.GoalScored(awaygoal);
                GoalCal = c.GOalConceded(homegoal);
                GoalDal = c.goaldiff();
                Points = c.changepoints(homegoal, awaygoal);
                }
                else{
                    continue;
                }
                club = new Club(clname, GoalVal, GoalCal, GoalDal,Points);
                PrintTable.add(club);
                }
            }
       
        for(Club c : PrintTable){
        System.out.println("Club data" +c);
        } 
        
        for(int iterl=PrintTable.size()-1;iterl>0;iterl--){
            Club cluba = PrintTable.get(iterl);
            String cname1 = cluba.getName();
           
            int count=0;
            for(int iterr=iterl-1;iterr>0;iterr--){
                Club clubb = PrintTable.get(iterr);
            String cname2 = clubb.getName();
            if(cname1.equals(cname2) && !ClubNames.contains(cname1)){
                FinalTable.add(cluba);
                ClubNames.add(cname1);
            }
            }
        }
        
        
    }
    public void printtable(){
        for(Club c : FinalTable){
            System.out.println(c);
            String clubname = c.getName();
            int goalsdone = c.goalscor();
            int goalsconceeded = c.goalcon();
            int points = c.getpoints();
            String toprint = " " + clubname + "      " + goalsdone + "   " + goalsconceeded + "  " + points;
            op = String.join("\n",op,toprint );
            System.out.println( op );
        }
        
        
            
            
            try{
                FileWriter myWriter = new FileWriter("Leaguetable.txt");
            myWriter.write(op);
            myWriter.close();/*
            FileOutputStream fos = new FileOutputStream("output.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);   
        oos.writeObject(FinalTable); // write MenuArray to ObjectOutputStream
        oos.close();*/
        }catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
}
    
    public void topscorer(ArrayList<Player> playerlist){
        int HighestGoal = 0;
        String TopScorer = "";
        for(Player p : playerlist){
            String playername = p.playern();
            int goalsscored = p.displaygoal();
            if(goalsscored >HighestGoal){
                HighestGoal = goalsscored;
                TopScorer = playername;
            }
            
        }
        System.out.println("Top Scorer is " +TopScorer + "scored" + HighestGoal);
    }
}
        
        /*public void altertable(ArrayList<Club> PrintTable, String clname, int godo, int goca, int goda, int po){
            for(Club Ca: PrintTable){
                String clubname = Ca.getName();
                if(clubname.equals(clname)){
                    Ca.GoalScored(godo);
                    Ca.GOalConceded(goca);
                    Ca.goaldiff();
                }
            }
        }*/
    
            
       // to print the fixtures and create a Match instance and store it in arraylist.
  
    

