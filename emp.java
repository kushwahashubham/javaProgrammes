import java.util.*;

class Employee 
{
    static String name;
    static int salary,emp_id;
    
    void input(String name, int emp_id, int salary)
    {
        this.name =name;
        this.emp_id=emp_id;
        this.salary= salary;
    }
    
    void getEmployee(String name, ArrayList<Employee> b1)
    {
        for(Employee k:b1)
        {
        if(name.equals(k.name))
        {
            System.out.println("The salary of the candidate is: "+salary);
        }
            else{
                System.out.println("The candidate is not present in the organization");
            }
                
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee a1 = new Employee();
        name = sc.nextLine();
        salary= sc.nextInt();
        emp_id=sc.nextInt();
        ArrayList<Employee> AL = new ArrayList<Employee>();
        AL.add(a1);
        a1.getEmployee(name,AL);
             
    }
}