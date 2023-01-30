import com.thinking.machines.util.*;
class KeyboardTestcase
{
publt
32ic static void main(String gg[])
{
Keyboard k=new Keyboard();
String a;
System.out.print("Enter a string : ");
a=k.getString();
String b;
b=k.getString("Enter another String  : ");
char c;
c=k.getCharacter("Enter  gender (M/F) :");
long d;
d=k.getLong("Enter a long type value : ");
int e;
e=k.getInt("Enter an int type value  :");
float f;
f=k.getFloat("Enter Float type value  :");
double g;
g=k.getDouble("Enter a double type value");
short h;
h=k.getShort("Enter a short type value : ");
byte i;
i=k.getByte("Enter a byte type value : ");
boolean j;
j=k.getBoolean("Enter a boolean type value : ");
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);
System.out.println(j);
}
}