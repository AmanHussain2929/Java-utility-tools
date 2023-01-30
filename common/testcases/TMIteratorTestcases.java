import com.thinking.machines.util.*;
class TMIteratorTestcases
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
TMArrayList list2=new TMArrayList();
list2.add(11);
list2.add(22);
list2.add(33);
list2.add(44);
System.out.println("iterating on linked list");
TMIterator k=list1.iterator();
int x;
while(k.hasNext())
{
x=k.next();
System.out.println(x);
}
System.out.println("iterating on ArrayList list");
TMIterator p=list1.iterator();
while(p.hasNext())
{
x=p.next();
System.out.println(x);
}
}
}