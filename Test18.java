import java.util.HashSet;
import java.util.Iterator;
class Test18
{
   public static void main(String args[])
{
LinkedHashSet<Employee> hs = new LinkedHashSet<Employee>();
hs.add(new Employee(101,"Hari",1000.00));
hs.add(new Employee(102,"James",3000.00));
hs.add(new Employee(103,"John",4000.00));
hs.add(new Employee(102,"James",3000.00));
for (Employee e : hs)
 e.display();
Iterator<emoloyee> itr = hs.iterator();
while(itr.hasNext())
itr.next().display();
}
}



