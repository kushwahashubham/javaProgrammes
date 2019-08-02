/*givine a array card no and bal 
wap for shopp site ask user to enter theamount and the card number.
    if the card no donot exist then throw no such card exception and handle the exception it ask the user to reenter the card number if the user enter the incorrect card no 3 time s display transction failed, if the card has not sufficient balance show insufficent balance exception and catch it to display the msg addbalance .*/

import java.util.*;
class noSuchCardException extends Exception{
    void invalidcardNumber(){
        System.out.println("Card is invalid\nPlease enter the card number again");
    }
}
class notSufficientBalanceException extends Exception{
    void nobalance(){
        System.out.println("Not Sufficient balance in your account");
    }
    
}
class testCard{
    
    
    void checkCardNumber() throws noSuchCardException,notSufficientBalanceException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the card Number");
        int a = sc.nextInt();
        HashMap<Integer,Double> m1 = new HashMap<Integer,Double> ();
        m1.put(11702545,1105468.50);
        m1.put(11702551,0.0);
        boolean b = m1.containsKey(a);
        if(b == false){
            throw new noSuchCardException();
        }
        
        System.out.println("Enter the Amount");
        int d = sc.nextInt();
        int c =m1.get(a);
        if(d>c){
            throw new notSufficientBalanceException();
        }
        System.out.println("Amount debited");
    }
}

    class test{
    public static void main(String []args){
        
        testCard s = new testCard();
        try{
           s.checkCardNumber(); 
        }
        catch(noSuchCardException e){
            System.out.println("Reenter the card nmber");
        }
        catch(notSufficientBalanceException e){
            System.out.println("Add Balance to your account");
        }
    }
}
