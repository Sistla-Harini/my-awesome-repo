class Employee
{
private int empid;
private String ename;
double salary;
public Employee(){}
public Employee(int empid,String ename, double salary)
{
this.empid=empid;
this.ename=ename;
this.salary=salary;
}
public void setempid(int empid)
{
this.empid=empid;
}
public void setename(String ename)
{
this.ename=ename;
}
public void setsalary(double salary)
{
this.salary=salary;
}
public int getempid()
 {
return empid;
}
public String getename()
{
return ename;
}
public double getsalary()
{
return salary;
}
}
class Test
{
public static void main(String[]args)
{
Employee e=new Employee(101,"ajay",25000);
System.out.println("Empid is "+e.getempid());
System.out.println("ename is "+e.getename());
System.out.println("salary is "+e.getsalary());
}
}









