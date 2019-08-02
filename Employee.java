import java.util.*;

class Employee 
{
    String name;
    int salary,emp_id;
    
    
    void getEmployee()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        salary= sc.nextInt();
        emp_id=sc.nextInt();
    }
    public static void main(String [] args)
    {
        Employee a1 = new Employee();
        ArrayList<Employee> AL = new ArrayList<Employee>();
        
          a1.getEmployee();
        AL.add(a1);  
        
        for(Employee AN:AL)
        {
            System.out.println(AN.name+" "+AN.salary+" "+AN.emp_id);
        }
    }
}