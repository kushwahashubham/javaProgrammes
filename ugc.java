import java.util.*;

interface UGC{
    default int getAdmission(){
        if(i>=60){
            Random rand=new Random();
            long rand1 = rand.nextInt(100000);
            System.out.print("Yor registration number is: "+rand1);
        }
        else{
            System.out.print("You are not eligible for admission");
        }
    }
    String payFee();
}
interface AICTE{
    default int getAdmission(){
        System.out.println("please ion the counselling after 5 days");
        System.out.println("Date of counselling :10/05/2019");
            Random rand=new Random();
            long rand1 = rand.nextInt(100000);
            System.out.print("Yor token number is: "+rand1);
    }
    String payFee();
}
  class University implements UGC,AICTE{
    int i;
      static int feeDue;
    
    public static void main(String [] args){
        System.out.println("Enter the percentage in qualifying exaam");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        UGC U = new University();
        AICTE A = new University();
        if(i>=60){
            U.getAdmission();
            feeDue = 25000;
            System.out.println("your due fee is " + feeDue);
            /*U.payFee(){
                Scanner sc = new Scanner(System.in);
                int deposit = sc.netInt();
                feeDue = feeDue - deposit;
                System.out.println("Your REMAINING due fee is " + feeDue);
            }*/
        }
            else{
                A.getAdmission();
                feeDue = 34000;
                System.out.println("our due fee is " + feeDue);
                /*A.payFee(){
                Scanner sc = new Scanner(System.in);
                int deposit = sc.nextInt();
                feeDue = feeDue - deposit;
                System.out.println("Your REMAINING due fee is " + feeDue);
            }*/
            }
        }   
}
