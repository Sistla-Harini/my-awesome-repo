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
Employee[] e;
public Department() {}
public Department(int deptid,String deptname,Employee[] e)
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
Employee[] e;
}
}
class Test4
{
public static void main(String args[])
{
Employee[] e1={new Employee(101,"Harini",1000),new Employee(102,"Rishi",2000),new Employee(103,"Padhu",3000)};
Department d=new Department(10,"Sales",new Employee(101,"Harini",25000));
System.out.println("deptid is "+d.getdeptid());
System.out.println("deptname is "+d.getdeptname());
System.out.println("Employee details");
for(int i=0;i<e2.length;i++)
{
System.out.println("empid is "+e2[i].getempid());
System.out.println("empname is "+e2.getempname());
System.out.println("salary is "+e2.getsalary());
}
