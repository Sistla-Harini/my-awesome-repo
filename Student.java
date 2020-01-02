class Student
{
private int rno,m1,m2,m3;
private string name;
public Student() {}
public Student(int rno,String name,int m1,int m2,int m3)
{
 this.rno=rno;  this.name=name;   this.m1=m1;   this.m2=m2;  this.m3=m3;
}
public int gettotal() {return m1+m2+m3;}
public int getaverage() {return (m1+m2+m3)/3;}
public String getresults()
{
if(m1>40 && m2>40 && m3>40)
return "passed";
return "failed";
}
public String getdivision()
{
if(m1>=40 && m2>40 && m3>=40)
}
public void setrno(int rno)
{
this.rno=rno;
}
public void
class Test2
{
 public static void main(String[] args)
 {
   Student s =new Student(101,"john",50,60,70);
   System.out.println(s.getrno());
   System.out.println(s.getname());
   System.out.println(s.gettotalmarks());
   System.out.println(s.getaverage());
   System.out.println(s.getresults());
   System.out.println(s.getdivision());
  }
}