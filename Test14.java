import java.util.HashSet;
class Test14
{
public static void main(String args[])
{
HashSet<String> hs1= new HashSet<String>();
hs1.add("welcome");    hs1.add("hello");
hs1.add("bye bye");     hs1.add("Farewell");
HashSet<String> hs2= new HashSet<String>();
hs2.add("Apple");    hs2.add("Banana");
hs1.addAll(hs2);
for (String s: hs1)
 System.out.println(s);
}
}