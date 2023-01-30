import com.thinking.machines.util.*;
class TMArrayListTestcases
{
public static void main(String gg[])
{
TMArrayList list1=new TMArrayList();
list1.add(10);
list1.add(20);
list1.add(30);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
 list1.add(50,1);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
 list1.insert(2,500);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
 int r= list1.removeAt(3);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
list1.removeAll();
System.out.println(list1.size());
list1.add(70);
list1.add(80);
list1.add(90);
list1.update( 1,100);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
TMArrayList list2;
list2=new TMArrayList();
list1.copyTo(list2);
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
TMArrayList list3;
list3=new TMArrayList();
list3.add(22);
list3.add(16);
list3.add(55);
list2.copyFrom(list3);
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
list1.appendTo(list2);
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
list3.appendFrom(list1);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
}
}