import com.thinking.machines.util.*;
class forEachTestcases
{
public static void main(String gg[])
{
TMList list1=new TMArrayList();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
list1.add(50);
list1.add(60);
list1.forEach((p)->{System.out.println(p);});
System.out.println("*************************");
TMList list2=new TMLinkedList();
list2.add(10);
list2.add(20);
list2.add(30);
list2.add(40);
list2.add(50);
list2.add(60);
list2.forEach((q)->{System.out.println(q);});
}
}