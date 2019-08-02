import java.util.Scanner;
class Lpu
{
    String facultyName, studentName, facultyAddress, studentAddress, facultyBg, studentBg;
    int facultyRegNum, studentRegNum, facultyId, studentId, facultyAge, studentAge;
    long  facultyPhone, studentPhone;

    void readDataOfFaculty()
{
    Scanner sc= new Scanner(System.in);
    System.out.println("the name of the faculty is:");
    facultyName = sc.nextLine();
    System.out.println("the Address of the faculty is:");
    facultyAddress = sc.nextLine();
    System.out.println("the Blood group of the faculty is:");
    facultyBg = sc.nextLine();
    System.out.println("the Registration number of the faculty is:");
    facultyRegNum = sc.nextInt();
    System.out.println("the Id of the faculty is:");
    facultyId = sc.nextInt();
    System.out.println("the Age of the faculty is:");
    facultyAge = sc.nextInt();
    System.out.println("the Phone of the faculty is:");
    facultyPhone = sc.nextLong();
}

void readDataOfStudent()
{
    Scanner sc= new Scanner(System.in);
    System.out.println("the name of the Student is:");
    studentName = sc.nextLine();
    System.out.println("the Address of the Student is:");
    studentAddress = sc.nextLine();
    System.out.println("the Blood group of the Student is:");
    studentBg = sc.nextLine();
    System.out.println("the Registration number of the Student is:");
    studentRegNum = sc.nextInt();
    System.out.println("the Id of the Student is:");
    studentId = sc.nextInt();
    System.out.println("the Age of the Student is:");
    studentAge = sc.nextInt();
    System.out.println("the Phone of the Student is:");
    studentPhone = sc.nextLong();
}  
    void computerSci()
{
      readDataOfStudent();
      readDataOfFaculty();
}

void mechanicalDept()
{
      readDataOfStudent();
      readDataOfFaculty();
}

void agricultureDept ()
{
      readDataOfStudent();
      readDataOfFaculty();
}

public static void main(String [] args)
{
Lpu ob1 = new Lpu();
ob1.computerSci();
ob1.mechanicalDept();
ob1.agricultureDept();
}
}