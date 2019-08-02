import java.util.Scanner;
class Restaurant
{
    static int price;
    static int orderNumber;
    static int momos=5,vegKofta=30, batataVada=45, sahiPaneer=80, tandoorNaan=10, aalooJeera=40, coke=20, lassi=25, mangoJuice=30;
    static int momoQuantity, vkQuantity, bvQuantity, spQuantity, tnQuantity, ajQuantity, cokeQuantity, lassiQuantity, mjQuantity;
    static int moreItems,enter;
    void mainMenu()
    {
        System.out.println("******************************************************************************");
        System.out.println("                       The Haveli Restaurant                                  ");
        System.out.println("******************************************************************************");
        System.out.println("                             MAIN-MENU                                        ");
        System.out.println("******************************************************************************");
        System.out.println("  Starter                    Main Meal                          Drinks        ");
        System.out.println("1.Momos-$5               4.Sahi Paneer-$80                   7.Coke-$20       ");
        System.out.println("2.Veg Kofta-$30          5.Tandoor Naan-$10                  8.Lassi-$25      ");
        System.out.println("3.Batata Vada-$45        6.Aaloo Jeera-$40                   9.Mango Juice-$30");
        System.out.println("******************************************************************************");
        itemQuantity();
    }
    void itemQuantity()
    {
       Scanner sc = new Scanner(System.in);
        String k= sc.nextLine();
        switch(k)
            {
            case "1": System.out.println("You have selected Momos");
                    System.out.println("Enter quantity of the item");
                    momoQuantity = sc.nextInt();
                break;
            case "2": System.out.println("You have selected Veg Kofta");
                    System.out.println("Enter quantity of the item");
                    vkQuantity = sc.nextInt();
                break;
                
            case "3": System.out.println("You have selected Batata Vada");
                    System.out.println("Enter quantity of the item");
                    bvQuantity = sc.nextInt();
                break;
            
            case "4": System.out.println("You have selected Sahi Paneer");
                    System.out.println("Enter quantity of the item");
                    spQuantity = sc.nextInt();
                break;
                
            case "5": System.out.println("You have selected Tandoor Naan");
                    System.out.println("Enter quantity of the item");
                    tnQuantity = sc.nextInt();
                break;
                
            case "6": System.out.println("You have selected Aaloo Jeera");
                    System.out.println("Enter quantity of the item");
                    ajQuantity = sc.nextInt();
                break;
                
            case "7": System.out.println("You have selected coke");
                    System.out.println("Enter quantity of the item");
                    cokeQuantity = sc.nextInt();
                break;
                
            case "8": System.out.println("You have selected Lassi");
                    System.out.println("Enter quantity of the item");
                    lassiQuantity = sc.nextInt();
                break;
                
            case "9": System.out.println("You have selected Mango Juice");
                    System.out.println("Enter quantity of the item");
                    mjQuantity = sc.nextInt();
                break;
                   
        }
         
    }
    
    void reIteration()
    {
       Scanner sc1 = new Scanner(System.in); 
       System.out.println("Do you want to add more items,Yes=1 or N0=2 ?");
       moreItems= sc1.nextInt();
       if(moreItems==1)
        {
            mainMenu();
	reIteration();
	
        }
        else
        {
            System.out.println("You have selected following items");
            if(momoQuantity != 0)
            {
                System.out.println("Momos-"+momoQuantity);
            }
            if(vkQuantity != 0)
            {
                System.out.println("Veg Kofta-"+vkQuantity);
            }
            if(bvQuantity != 0)
            {
                System.out.println("Batata Vada-"+bvQuantity);
            }
            if(spQuantity != 0)
            {
                System.out.println("Sahi Paneer-"+spQuantity);
            }
            if(tnQuantity != 0)
            {
                System.out.println("Tandoor Naan-"+tnQuantity);
            }
            if(ajQuantity != 0)
            {
                System.out.println("Aaloo Jeera-"+ajQuantity);
            }
            if(cokeQuantity != 0)
            {
                System.out.println("Coke-"+cokeQuantity);
            }
            if(lassiQuantity != 0)
            {
                System.out.println("Lassi-"+lassiQuantity);
            }
            if(mjQuantity != 0)
            {
                System.out.println("Mango Juice-"+mjQuantity);
            }
            
          }  
	
	}   
    }
    
void printBill()
	{
		
        
                System.out.println("Here is Your Bill");
	 if(momoQuantity != 0)
            {
                System.out.println("Momos-"+momos*momoQuantity);
            }
            if(vkQuantity != 0)
            {
                System.out.println("Veg Kofta-"+vegKofta*vkQuantity);
            }
            if(bvQuantity != 0)
            {
                System.out.println("Batata Vada-"+batataVada*bvQuantity);
            }
            if(spQuantity != 0)
            {
                System.out.println("Sahi Paneer-"+sahiPaneer*spQuantity);
            }
            if(tnQuantity != 0)
            {
                System.out.println("Tandoor Naan-"+tandoorNaan*tnQuantity);
            }
            if(ajQuantity != 0)
            {
                System.out.println("Aaloo Jeera-"+aalooJeera*ajQuantity);
            }
            if(cokeQuantity != 0)
            {
                System.out.println("Coke-"+coke*cokeQuantity);
            }
            if(lassiQuantity != 0)
            {
                System.out.println("Lassi-"+lassi*lassiQuantity);
            }
            if(mjQuantity != 0)
            {
                System.out.println("Mango Juice-"+mangoJuice*mjQuantity);
            }
            }
        
    
        
    public static void main(String [] args)
    {
        Restaurant ob1 = new Restaurant();
        ob1.mainMenu();
        ob1.itemQuantity();
        ob1.reIteration();
ob1.printBill();
    }
}