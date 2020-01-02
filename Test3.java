class Employee
{
private int empid;
private string ename;
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
class Department
{
int deptno;
String deptname;
int Employee e;
public Department() {}
public Department(int deptid,String deptname,Employee e)
{
this.deptno=deptno;
this.deptname=deptname;
this.e=e;
}
public void setdeptid(int deptid)
{
this.deptid=deptid;
}
public void setdeptname(String deptname)
{
this.deptname=deptname;
}
public int getdeptid()
{
return deptid;
}
Employee e;
}
}
class Test3
{
public static void main(String args[])
{
Department d=new Department(10,"Sales",new Employee(101,"Harini",25000));
System.out.println("deptid is "+d.getdeptid());
System.out.println("deptname is "+d.getdeptname());
System.out.println("Employee details");
System.out.println("empid is "+d.getEmployee().getempid());
System.out.println("empname is "+d.getEmployee().getempname());
System.out.println("salary is "+d.getEmployee().getsalary());
}
