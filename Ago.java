import java.util.Scanner;
class A
{
int a;
String b;
void read(int a, String b)
{
this.a=a;
this.b=b;
}
void see()
{
System.out.println(b+"  "+a);
}
}
class Ago
{
   public static void main(String [] args)
{

Scanner sc= new Scanner(System.in);
A a1=new A();
System.out.println("the Name is:" );  
String s1= sc.nextLine();
System.out.println("the Rollno. is:" ); 
int s2 = sc.nextInt();
a1.read(s2,s1);
a1.see();
}
}