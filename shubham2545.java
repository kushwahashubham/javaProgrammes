import java.util.*;

class employee
{
	String name;
	int age,salary;
	int id;
void empRecord()
{
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name ");
	this.name=sc.nextLine();
System.out.println("Enter the age");
	this.age=sc.nextInt();
System.out.println("Enter the salary  ");
	this.salary=sc.nextInt();
menu();
}
 void desig()
{
if(this.salary<=15000 )
{
System.out.println("The Designation is Clerk");
}
else if(this.salary>15000 && this.salary<30000)
{
System.out.println("The Designation is manager");
}
else
{
System.out.println("The Designation is CEO");
}
}

void printRecord()
{
System.out.println("EMP name:-"+this.name);
System.out.println("EMP age:-"+this.age);
System.out.println("EMP salary:-"+this.salary);
desig();
empId();
menu();
}

void empId()
{
	Random rand = new Random();
	this .id=rand.nextInt(1000);
	System.out.println("EMP ID:-"+this.id);
}

void menu()
{
System.out.println("1.Create Emplyee Record\n 2. Display Record\n 3. exit");
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
switch(p){
case 1: 
 	empRecord();
	break;
case 2: 	
	printRecord();
	break;
case 3: 
	break; 
}
}

public static void main(String [] args)
{
 	employee a1 = new employee();
	a1.menu();
}
}
