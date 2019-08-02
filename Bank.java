import java.util.Scanner;
class Bank
{
    static String AcHolderName, password, tempName,tempPassword;
        static int age,iniDeposit,updatedAmount,withdrawAmount;
    void menu()
    {
        System.out.println("******************************************************************************");
        System.out.println("                       The Bank of Shubham                                  ");
        System.out.println("******************************************************************************");
        System.out.println("                           Banking System                                     ");
        System.out.println("******************************************************************************");
        System.out.println("  1.Create Account");
        System.out.println("  2.Deposit");
        System.out.println("  3.Withdraw");
        System.out.println("  4.Balance Enquiry");
        System.out.println("******************************************************************************");
    }
    
    void CreateAccount()
    {
        
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account older name");
        AcHolderName= sc.nextLine();
        System.out.println("Enter the password");
        password=sc.nextLine();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the Initial Deposite");
        iniDeposit=sc.nextInt();
        
    }
    
    void Deposit()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Your Balance is this"+iniDeposit);
        System.out.println("Enter the amount of Deposit");
        updatedAmount= sc1.nextInt();
        iniDeposit=iniDeposit+updatedAmount;
        System.out.println("Your Updated Balance is this"+iniDeposit);
        
    }
    void Withdraw()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Your Balance is this"+iniDeposit);
        System.out.println("Enter the amount of Withdraw");
        withdrawAmount=sc2. nextInt();
        iniDeposit=iniDeposit-withdrawAmount;
        System.out.println("Your Updated Balance is this"+iniDeposit);
    }
    
    void viewBalance()
    {
        System.out.println("Your Balance is this"+iniDeposit);
    }
    
    void checkCredential()
    {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter Your Account Name");
        tempName=sc3.nextLine();
        System.out.println("Enter the Password");
        tempPassword=sc3.nextLine();
            
        if(tempPassword.equals(password) && tempName.equalsIgnoreCase(AcHolderName) )
        {
	menu();
	Scanner sc4 = new Scanner(System.in);
        String k= sc4.nextLine();
        switch(k)
        {
                case "1": System.out.println("You have selected to Create Account");
                        CreateAccount();
                break;
                
                case "2": System.out.println("You have selected to Deposite");
                        Deposit();
                break;
                
                case "3": System.out.println("You have selected to Withdraw");
                        Withdraw();
                break;
                
                case "4": System.out.println("You have selected to Check Balance");
                          viewBalance();
                break;
        }
        }
        else
        {
           System.out.println("Credentials are wrong!!!");
        }
    }
    
    public static void main(String [] args)
    {
        Bank a1 = new Bank();
        a1.menu();
        a1.CreateAccount();
        a1.checkCredential();
    }
}