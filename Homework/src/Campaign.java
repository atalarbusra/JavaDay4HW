
public class Campaign {
    private String campaignType;
    private int discount; 

    public Campaign(String campaignType, int discount) {
        this.campaignType = campaignType;
        this.discount = discount;
    }

    public String getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
}
