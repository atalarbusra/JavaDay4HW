
public class Main {
    
    public static void main(String [] args)
    {
        
        Gammer gammer =new Gammer("Büşra","Atalar","444","1995");
        Game game =new Game( "Candy Crush", "4", "sanal",45);
        GammerManager gammerManager=new GammerManager();
        Validation valid=new Validation();
        gammerManager.logIn(gammer,valid);
      
        
        
        
        
        
        
    }
    
    
    
    
}
