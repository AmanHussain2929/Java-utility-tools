import com.thinking.machines.util.*;
class Dummy
{
public static void main(String gg[])
{
System.out.println("Array list iterator");
TMList<String> list=new TMArrayList<String>();
list.add("Aman");
list.add("Aksa");
list.add("Sajid");
list.add("Shagufta");
list.add("Sadiq");
list.add("pappan");
TMIterator<String> iterator=list.iterator();
while(iterator.hasNext())
{
System.out.println(iterator.next());
}
}
}