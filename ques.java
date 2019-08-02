import java.util.*;

class Library
{
    int maths,eng,chem,phy,bio;
    
    library(){
        this.maths=10;
        this.eng=8;
        this.chem=9;
        this.phy=12;
        this.bio=5;
    }
    
   public void view()
   {
       System.out.println("The no of books avilable are-")
           System.out.println("Mathematics "+ this.maths);
       System.out.println("English "+ this.eng);
       System.out.println("Chemistry "+ this.che);
       System.out.println("Physics "+ this.phy);
       System.out.println("Biology "+ this.bio);
       
   }
    
    public boolean order(String authorname, User U)
    {
        
        
        
    }
}
class User
{
    String name;
    int userId;
    
    public void User(){
        
        this.name=name;
        this.userId=userId;
    }
}