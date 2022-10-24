
/**
 * Player class is a template to hold player details.
 *
 * @author (Alagappan)
 * @version (08-10-2022)
 */

public class Player 
{
    // instance variables - replace the example below with your own
    
    private String Name;
    private String Date; 
    private int Height;
  private int Goals;
  private String PlaysFor;
  private int Age;
  private int Id;
  private boolean selection;
  

    /**
     * Constructor for objects of class Player
     */
    public Player(String Name, String DOB, int age, int height, String club, boolean selection)
    {
       this.Name = Name;
        this.Date = DOB;
        this.Age = age;
        this.Height = height;
        PlaysFor = club;
        this.selection = selection;
        Goals = 0;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void Player(String Name, String DOB, int age, int height, String club, int id)
    {
        this.Name = Name;
        this.Date = DOB;
        this.Age = age;
        this.Height = height;
        PlaysFor = club;
        this.Id = id;
    }
    
    public void setPlayer(String Name,String DOB,int age,int height,String club,int id,int goals )
    {
        this.Name = Name;
        this.Date = DOB;
        this.Age = age;
        this.Height = height;
        PlaysFor = club;
        this.Id = id;
        Goals = goals;
    }
    
    public void getPlayer(){
        System.out.println("Player details:");
        System.out.println(Name );
        System.out.println(Date );
        System.out.println(Height );
        System.out.println(PlaysFor );
        System.out.println(Id);
    }
    
    public void addgoal(int goalcount){
        Goals = Goals+goalcount;
        
    }
    
    public int displaygoal(){
        return Goals;
    }
    
    public void resetgoals(){
        Goals =0;
    }
    
    public String club(){
        return PlaysFor;
    }
    
    public String playern(){
        return Name;
    }
    
    public int age(){
        return Age;
    }
    
    public int height(){
        return Height;
    }
    
    public String name(){
        return Name;
    }
    
    public boolean select(){
        return selection;
    }
    
    @Override
    public String toString() {
        return "Player{" +
                "Name of player='" + Name+ '\'' +
                ", Age=" + Age + 
                ", Goals scored=" + Goals + 
                '}';
    }
}
