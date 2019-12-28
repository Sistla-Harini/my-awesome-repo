import java.util.ArrayList;
import java.Collections;
class Student
 {
   int sid;
   String sname;
   double age;
   public Student() {}
   public Student(int sid,string sname,double age)
   {
     this.sid=sid;
     this.sname=sname;
     this.age=age;
   }
  public void getSid(int sid)
  {
    this.sid=sid;
  }
 public void getSname(String sname)
  {
   this.sname=sname;
  }
 public void getAge(double age)
 {
  this.age=age;
 }
 public int setSid()
 {
   return sid;
  }
 public String setSname()
 {
   return sname;
  }
 public double setAge()
 {
  return age;
  }
}
 class Training
 {
   int training;
   String trainingname;
   String listofstudents;
   public Training() {}
   public Training(int training, String trainingname, String listofstudents)
  {
    this.training=training;
    this.trainingname=trainingname;
    this.listofstudents=listofstudents;
  }
  public void getTraining(int training)
  { 
    this.training=training;
   }
  public void getTrainingname(String Trainingname)
  {
    this.trainingname=trainingname;
  }
 public void getListofstudents(String listofstudents)
 {
   this.listofstudents=listofstudents;
 }
 public int setTraining()
 {
   return training;
 }
 public int setTrainingname()
{
  return trainingname;
 }
public int setListofstudents()
 {
  return listofstudents;
  }
 ArrayList<Student> slist=new ArrayList<>;
}
class Testa
{
 ArrayList Training[] t=new Training(10,"java",student[]);
  ArrayList Student[] s=new Student(101,"harini",20);
  System.out.println("   "+t.getTraining,t.getTrainingname,t.getListofstudents);
  System.out.println("    "+s.getSid,s.getSname,s.getAge);
 }