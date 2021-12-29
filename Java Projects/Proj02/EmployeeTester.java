
public class EmployeeTester
{
   public static void main(String args[])
   {
       Employee e1 = new Employee("Bob", 100);
       System.out.println(e1.getName());
       System.out.println(e1.getSalary());
       e1.raiseSalary(10);
       System.out.println(e1.getSalary());
   }
}
