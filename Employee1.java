import java.util.HashSet;
import java.util.Iterator;
class Employee {
int empid;
String ename;
double salary;
public Employee() {}
public employee(int empid,String ename, double salery)
{
this.empid=empid;  this.ename=ename;  this.salary=salary;
}
public void display()
{
system.out.println(empid+"  "+ename+"   "+salary");
}
public int hashcode()
{
return empid;
}
public boolean equals (object obj)
{
Empl e = (Empl)obj;
return empid==e.empid && name.equals(e.name) && salary==e.salary;
}
}
