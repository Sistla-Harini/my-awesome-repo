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
public void setsalary(double salary)
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
public boolean equals(Object obj)
{
Employee e=(Employee)obj;
return empid==e.empid && ename.equals(e.ename) && salary==e.salary;
}
}
class Department
{
int deptno;
String deptname;
 Employee[] e;
public Department() {}
public Department(int deptid,String deptname,Employee[] e)
{
this.deptno=deptno;
this.deptname=deptname;
}
public void setDeptno(int deptno)
{
this.deptno=deptno;
}
public void setDeptname(String deptname)
{
this.deptname=deptname;
}
public void setEmployee(Employee[] e)
{
this.e=e;
}
public int getDeptno()
{
return deptno;
}
public String getDeptname()
{
return deptname;
}
public Employee[] getEmployee()
{
return e;
}
}
class Test5
{
public static void main(String args[])
{
Employee e1=new Employee(101,"Harini",1000);
Employee e2=new Employee(101,"Harini",1000);
System.out.println(e1.equals(e2));
}
}
