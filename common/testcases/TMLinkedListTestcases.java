import com.thinking.machines.util.*;
class TMLinkedListTestcases
{
public static void main(String gg[])
{
System.out.println("TMLinkedList Testcases");
TMLinkedList list1=new TMLinkedList();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
list1.add(50);
list1.add(60);
System.out.println("printing list");
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("************************");
list1.insert(4,88);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("************************");
int r;
r=list1.removeAt(4);
System.out.println("remove : "+r);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("************************");
list1.update(1,100);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
}
}