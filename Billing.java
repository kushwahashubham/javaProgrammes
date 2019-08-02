import java.util.Scanner;
class Billing
{
    static int price;
    static int quantity;
    static int coupon;
    
    static double computeBill(int price)
    {
        System.out.println("He Price of One Photobook is:");
        double due =price + price*.08;
        return due;
    }
    
    static double computeBill(int price,int quantity)
    {
        System.out.println("He Price of One Photobook is:");
        double due = (price*quantity)+(price*quantity)*.08;
        return due;
    }
    
    static double computeBill(int price,int quantity, int coupon)
    {
        System.out.println("He Price of One Photobook is:");
        double due =(price*quantity)+ ((price*quantity)*.08)-coupon;
        return due;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        switch(k)
        {
            case 1: System.out.println("The first case");
                    System.out.println("Enter price of the book");
                    price = sc.nextInt();
                    double Bill = Billing.computeBill(price);
                    System.out.println("he total Due is: "+ Bill);
                break;
            case 2: System.out.println("The Second case");
                    System.out.println("Enter price of the book");
                    price = sc.nextInt();
                    System.out.println("Enter quantity of the book");
                    quantity = sc.nextInt();
                    double bill = Billing.computeBill(price,quantity);
                    System.out.println("he total Due is: "+ bill);
                break;
                
            case 3: System.out.println("The Thired case");
                    System.out.println("Enter price of the book");
                    price = sc.nextInt();
                    System.out.println("Enter quantity of the book");
                    quantity = sc.nextInt();
                    System.out.println("Enter the Amount of coupon");
                    coupon = sc.nextInt();
                    double Bill1 = Billing.computeBill(price,quantity,coupon);
                    System.out.println("he total Due is: "+ Bill1);
                break;
                   
        }
    }
}