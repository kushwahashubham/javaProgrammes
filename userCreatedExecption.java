/*write a prog to define a customizw e exception invalidString Exception s.t. it displays the msg string is not excepted when msg is printed.
    crrate a class estString whoch reads the string at run time and if the string having less than 6 char then throw the invalid string char and display thecatch block.1*/
        
        
import java.util.*;
class invalidStringException extends Exception{
    void invalidString(){
        System.out.println("String is invalid");
    }
    
}
class testString{
    
    static String a;
    static int b;
    
    void checkString() throws invalidStringException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        a = sc.nextLine();
        if(a.length()>6){
            System.out.println("String is less than 6");
            throw new invalidStringException();
        }
        
    }
}

class test{
    
    
    public static void main(String []args){
        testString s = new testString();
        try{
           s.checkString(); 
        }
        catch(Exception e){
            System.out.println("Exception thrown");
        }
    }
}