import java.util.*;
class age1 extends Exception{
    age1(){
        System.out.println("You are not Eligible for voter card");
    }
    
}
class Voter{
    static String name;
    static int DOB;
    int voter_id;
    static Boolean voter_card;
 
    Voter(String name, int DOB, Boolean voter_card ){
        this.name =name;
        this.DOB = DOB;
        this.voter_card = voter_card;
    }
    
    void age() throws age1{
        int age = 2019-DOB;
        if(voter_card==false){
        if(age>18){
            System.out.println("You are eligiblae for Voter Card");
            Random rand = new Random();
            voter_id = rand.nextInt(10000);
            voter_card = true;
        }
        else{
            throw new age1();
        }
        }
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        DOB = sc.nextInt();
        voter_card = sc.nextBoolean();
        Voter a1 = new Voter(name,DOB,voter_card);
        try{
            a1.age();
        }
        catch(Exception e){
            
        }

    }
}