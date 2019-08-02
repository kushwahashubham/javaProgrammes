import java.util.Scanner;
class Ammo
{

   public static void main(String [] args)
{
System.out.println(" the use of the scanner class");
Scanner sc= new Scanner(System.in);
System.out.println("the Name is:" );  
String s1= sc.nextLine();
System.out.println("the Rollno. is:" ); 
int s2 = sc.nextInt();
System.out.println("the float is:" );
float s3 = sc.nextFloat();
System.out.println("the Number is:" );
long s4 = sc.nextLong();
System.out.println("the Gender is:" );
char s5 = sc.next().charAt(0);
System.out.println( s1+" "+s2+" "+s3+" "+s4+" "+s5 );
}
}