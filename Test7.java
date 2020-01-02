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
class Test7
{
public static void main(String[] args)
{
Student e= new Student(101,"john",25,7001,25000);
System.out.println(e.getSsn());
System.out.println(e.getName());
System.out.println(e.getAge());
System.out.println(e.getSno());
System.out.println(e.getMarks());
}
}





