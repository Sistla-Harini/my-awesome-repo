class Person
{
 int ssn,age;
 String name;
public Person(){}
public Person(int ssn,String name,int age)
 { 
this.ssn=ssn;
this.name=name;
this.age=age;
}
public void setSsn(int ssn)
{
this.ssn=ssn;
}
public void setName(String name)
{
this.name=name;
}
public void age(int age)
{
this.age=age;
}
public int getSsn()
{
return ssn;
}
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
}
class Student extends Person
{
private int sno;
private double marks;
public Student() {}
public Student(int ssn,String name,int age,int sno,double marks)
{
  super(ssn,name,age);
  this.sno=sno;  this.marks=marks;
}
public void setSno(int sno) 
{
this.sno=sno;
}
public void setMarks(double Marks)
{
this.marks=marks;
}
public int getSno()
{
return sno;
}
public double getMarks()
{
return marks;
}
}
class PgStudent extends Student
{
int Electives;
public PgStudent() {}
public PgStudent(int ssn,String name,int age,int empid,double salary,int Electives)
{
super(ssn,name,age,empid,salary);
this.electives=electives;
}
public void setElectives(int electives)
{
this.electives=electives;
}
public int getElectives()
{
return electives;
}
}
class Test9
{
public static void main(String[] args)
{
PgStudent ps= new PgStudent(101,"Harini",25,7001,15000,7);
System.out.println(ps.getSsn());
System.out.println(ps.getName());
System.out.println(ps.getAge());
System.out.println(ps.getEmpid());
System.out.println(ps.getSalary());
System.out.println(ps.getElectives());
}
}











