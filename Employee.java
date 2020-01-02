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
public void setEmpid(int empid)
{
this.empid=empid;
}
public void setEname(String ename)
{
this.ename=ename;
}
public void setSalary(double salary)
{
this.salary=salary;
}
public int getEmpid()
 {
return empid;
}
public String getEname()
{
return ename;
}
public double getSalary()
{
return salary;
}
}
class Test
{
public static void main(String[]args)
{
Employee e=new Employee(101,"ajay",25000);
System.out.println("Empid is "+e.getEmpid());
System.out.println("ename is "+e.getename());
System.out.println("salary is "+e.getsalary());
}
}









