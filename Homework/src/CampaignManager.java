
public class CampaignManager implements CampaignServices {
    
    public void addCampaign(Campaign campaign)
    {
        System.out.println(campaign.getCampaignType()+" "+"eklenildi."+ " "+campaign.getDiscount()+" "+"indirim yapıldı.");
    }
    public void deleteCampaign(Campaign campaign)
    {
        System.out.println(campaign.getCampaignType()+" "+"silindi.");
    }
    public void updateCampaign(Campaign campaign)
    {
        System.out.println(campaign.getCampaignType()+" "+"güncellendi.");
    }
    
}
