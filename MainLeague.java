
/**
 * Write a description of class MainLeague here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.HashSet;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; 

public class MainLeague
{
    // instance variables - replace the example below with your own
     
    private static String str;
    private static String name,date,clubname;
    private static int i, age, height, ID;
    private static Player playerclass;
    private static Club club;
    private static Matches Mat= new Matches(); // class declalrtion for Matches
    private static boolean selected;
    private static int matchno;
    private static League leag;
    private static  ArrayList<String> clubmum = new ArrayList<String>();   //to hold list of club name
    private static ArrayList<Player> playerlist = new ArrayList<Player>();    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public MainLeague(){
        matchno=0;
          
    }
    public static void main(String args[]) throws FileNotFoundException 
    {
        // put your code here
        //Scanner inFile =  new Scanner(new FileReader("D:\\NCL docs\\OOPS\\pratial\\Sportsleague\\inputfile.txt"));
        //System.out.println(inFile);
        Matches M;
        ArrayList<String> Inputdata = new ArrayList<String>();
        ArrayList<Matches> FixturesList = new ArrayList<Matches>();
        Inputdata.add("Odegaard,22041999,15,160,2,arsenal,true");
        Inputdata.add("Messi,23041999,33,155,3,PSG,true");
        Inputdata.add("Ronaldo,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Neymar,23041999,30,163,3,PSG,true");
        Inputdata.add("Mbappe,22041999,15,160,2,PSG,true");
        Inputdata.add("Gueye,23041999,33,155,3,PSG,true");
        Inputdata.add("Rashford,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Ramos,23041999,30,163,3,PSG,true");
        Inputdata.add("Marquinhos,23041999,30,163,3,PSG,true");
        Inputdata.add("Simons,23041999,30,163,3,PSG,true");
        Inputdata.add("paredes,23041999,30,163,3,PSG,true");
        Inputdata.add("Veratti,23041999,30,163,3,PSG,true");
        Inputdata.add("Sarabia,23041999,30,163,3,PSG,false");
        Inputdata.add("Sanches,23041999,30,163,3,PSG,true");
        Inputdata.add("Sancho,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Martial,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Anthony,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Elanga,23041999,36,165,3,Manchester United,false");
        Inputdata.add("Bruno,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Eriksen,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Casemeiro,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Tominay,23041999,36,165,3,Manchester United,false");
        Inputdata.add("Fred,23041999,36,165,3,Manchester United,false");
        Inputdata.add("Malacia,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Varane,23041999,36,165,3,Manchester United,true");
        Inputdata.add("Saka,22041999,15,160,2,arsenal,true");
        Inputdata.add("Jesus,22041999,15,160,2,arsenal,true");
        Inputdata.add("Martinelli,22041999,15,160,2,arsenal,true");
        Inputdata.add("Nketiah,22041999,15,160,2,arsenal,false");
        Inputdata.add("Xhaka,22041999,15,160,2,arsenal,true");
        Inputdata.add("Elneny,22041999,15,160,2,arsenal,true");
        Inputdata.add("Partey,22041999,15,160,2,arsenal,true");
        Inputdata.add("Saliba,22041999,15,160,2,arsenal,true");
        Inputdata.add("Gabriel,22041999,15,160,2,arsenal,false");
        Inputdata.add("Zinchenko,22041999,15,160,2,arsenal,true");
        Inputdata.add("Cedric,22041999,15,160,2,arsenal,false");
        Inputdata.add("Tierney,22041999,15,160,2,arsenal,true");
       
        
        for(int ind=0; ind<Inputdata.size();ind++){
            str =  Inputdata.get(ind);
        
        
        String [] strsplit = str.split(",");
        
        ArrayList<Player> player;
        
        player = new ArrayList<Player>();
        
        
        for ( i=0; i < str.length(); i++)
        {
          name = strsplit[0];
          date = strsplit[1];
          
          String go = strsplit[2];
          age = Integer.parseInt(go);
          String he = strsplit[3];
          height = Integer.parseInt(he);    
          String id = strsplit[4];
          ID = Integer.parseInt(id);
          
          clubname = strsplit[5];
          String sel = strsplit[6];       
          selected = Boolean.parseBoolean(sel);
        }
        
        clubmum.add(clubname);
        playerclass = new Player(name, date, age, height, clubname, selected);
        //club = new Club(clubname);
        leag = new League();
        
        playerlist.add(playerclass);
        
        //club.dispclub();
        
    }  
    for (int i = 0; i < playerlist.size(); i++) {
                
            System.out.println(playerlist.get(i) );
    } 
    
    ArrayList<String> allclubs = new ArrayList<String>( new HashSet<>(clubmum));
     leag.addclub(allclubs);
    
    FixturesList = leag.generatefixture(allclubs);
    
    /*for(int j =0;j<allclubs.size();j++){
        String homeclub = allclubs.get(j);
        for(int k=0;k<allclubs.size();k++){
            String awayclub = allclubs.get(k);
            if(!homeclub.equals(awayclub)){
                M = new Matches(homeclub, awayclub, "22041999","Newcastle");
                
                System.out.println(homeclub + "vs" +awayclub);
                MatList.add(M);
                
            }
            
            
        }  // to print the fixtures and create a Match instance and store it in arraylist.
        
    }*/
    
    
    
    System.out.println(FixturesList.size());
    for(Matches strprint: FixturesList){
        //System.out.println(strprint);
        String homeplayerclub = strprint.hometeam();
        String awayplayerclub = strprint.awayteam();
        System.out.println(homeplayerclub + " vs " +awayplayerclub  );
        Mat.playingeleven(playerlist, homeplayerclub, awayplayerclub);
        
        Mat.GoalScorers(strprint.goalsH(), strprint.goalsA(), homeplayerclub, awayplayerclub, playerlist);
        Mat.decider(strprint.goalsH(), strprint.goalsA(), homeplayerclub, awayplayerclub);
        }
    
    leag.leaguetable();   
    leag.printtable();
    
    for(Player p : playerlist){
            System.out.println(p);
        }
        
    leag.topscorer(playerlist);
}
       
}

