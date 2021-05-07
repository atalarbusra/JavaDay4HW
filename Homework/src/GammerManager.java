
public class GammerManager implements GammerServices{
    
    private Validation valid;
    
    
    public void signIn(Gammer gammer)
    {
        System.out.println("Signed in " + gammer.getFirstName()+" "+gammer.getLastName());
    }
    
    public void logIn(Gammer gammer,Validation valid)
    {
        if(valid.validation()==true)
        {
            System.out.println("Logged in " +gammer.getFirstName()+" "+gammer.getLastName());
        }
            
    }
    
    public void deleteAccount(Gammer gammer)
    {
        System.out.println("Deleted account  "+gammer.getFirstName()+" "+gammer.getLastName());
                
    }
    public void updateAccount(Gammer gammer)
    {
        System.out.println("Updated account "+gammer.getFirstName()+" "+gammer.getLastName());
    }
    
    
   
}
