
public class GameSelling {
    
    
    
    public void gameSelling(Gammer gammer,Game game)
    {
        System.out.println(game.getName() +"oyununu "+gammer.getFirstName()+ " "+gammer.getLastName()+" "+"satın aldı.");
        System.out.println(game.getName() +"stoktan eksiltildi.");
    }
    
    public void sellGameWithCampaign(Gammer gammer,Game game,Campaign campaign)
    {
        System.out.println(gammer.getFirstName() +" "
                +gammer.getLastName()+" "
                + game.getName()+" "
                +"oyununu "+campaign.getDiscount()+" "+"lira indirimli fiyatına satıldı.");
    }
    
    
}
