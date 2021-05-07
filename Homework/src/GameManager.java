
public class GameManager  implements GameServices  {
    
    
    
     public void addGame(Game game )
     {
         System.out.println(game.getName()+" "+"eklendi.");
     }


    public void deleteGame(Game game)
    {
        System.out.println(game.getName()+" "+"silindi");
    }



  public  void updateGame(Game game)
  {
      System.out.println(game.getName()+" "+"güncellendi.");
  }



   
}


