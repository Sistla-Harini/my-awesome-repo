import java.util.HashSet;
import java.util.Iterator;
class Test15
{
   public static void main(String args[])
{
HashSet<Employee1> hs = new HashSet<Employee1>();
hs.add(new Employee1(101,"Hari",1000.00));
hs.add(new Employee1(102,"James",3000.00));
hs.add(new Employee1(103,"John",4000.00));
hs.add(new Employee1(102,"James",3000.00));
for (Employee1 e : hs)
 e.display();
}
}



