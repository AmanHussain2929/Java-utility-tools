import com.thinking.machines.util.*;
class GenericTestcases
{
public static void main(String gg[])
{
TMArrayList<Integer> i=new TMArrayList<Integer>();
i.add(100);
i.add(200);
i.add(300);
i.add(400);
i.add(500);
i.add(600);
i.forEach((m)->{
System.out.println(m);
});
TMLinkedList<String> j=new TMLinkedList<String>();
j.add("ujjain");
j.add("indore");
j.add("kokata");
j.add("Bombay");
j.add("Goa");
j.add("Delhi");
j.forEach((m)->{
System.out.println("city : "+m);
});
}
}