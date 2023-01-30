package com.thinking.machines.util;
import java.lang.reflect.*;
import java.io.*;
public class SetterGetterGenerator
{
public static void main(String gg[])
{
if(gg.length!=1 && gg.length!=2)
{
System.out.println("usage : java  -classpath path_to_jar_file;.com.thinking.machines.util.SetterGetterGenerator class_Name constructor=true/false");
return ;
}
if(gg.length==2)
{
if(gg[1].equalsIgnoreCase("constructor=true")==false && gg[1].equalsIgnoreCase("constructor=false")==false)
{
System.out.println("usage : java  -classpath path_to_jar_file;.com.thinking.machines.util.SetterGetterGenerator class_Name constructor=true/false");
return ;
}
}
String className=gg[0];
try
{
Class c=Class.forName(className);
Field fields[]=c.getDeclaredFields();
Field field;
TMList<String> list=new TMArrayList<String>();
String setterName;
String getterName;
String tmp;
String fieldName;
String Line;
Class fieldType;
if(gg.length==1 || (gg.length==2 && gg[1].equalsIgnoreCase("constructor=true")))
{
Line="public "+c.getSimpleName()+"()";
list.add(Line);
list.add("{");
for(int e=0;e<fields.length;e++)
{
field=fields[e];
Line="this."+field.getName()+"="+getDefaultValue(field.getType())+";";
list.add(Line);
}
list.add("}");
}
for(int e=0;e<fields.length;e++)
{
field=fields[e];
fieldName=field.getName();
fieldType=field.getType();
if(fieldName.charAt(0)>=97 && fieldName.charAt(0)<=122)
{
tmp=fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
}
else
{
tmp=fieldName;
}
setterName="set"+tmp;
getterName="get"+tmp;
Line="public void "+setterName+"("+fieldType.getName()+" "+fieldName+")";
list.add(Line);
list.add("{");
Line="this."+fieldName+"="+fieldName+";";
list.add(Line);
list.add("}");
Line="public "+fieldType.getName()+" "+getterName+"()";
list.add(Line);
list.add("{");
Line="return this."+fieldName+";";
list.add(Line);
list.add("}");
}
File file=new File("tmp.tmp");
if(file.exists()) file.delete();
RandomAccessFile raf;
raf=new RandomAccessFile(file,"rw");
TMIterator<String> iterator=list.iterator();
while(iterator.hasNext())
{
Line=iterator.next();
raf.writeBytes(Line+"\r\n");
}
raf.close();
System.out.println("setter/getter for : "+c.getName()+"generates in file name tmp.tmp");
}catch(ClassNotFoundException cnfe)
{
System.out.println("unable to load the class,classpath missing");
}
catch(IOException ioe)
{
System.out.println(ioe.getMessage());
}
}
private static String getDefaultValue(Class c)
{
String className=c.getName();
if(className.equals("java.lang.Long") || className.equals("long")) return "0";
if(className.equals("java.lang.Integer") || className.equals("int")) return "0";
if(className.equals("java.lang.Short") || className.equals("short")) return "0";
if(className.equals("java.lang.Byte") || className.equals("byte")) return "0";
if(className.equals("java.lang.Double") || className.equals("double")) return "0.0";
if(className.equals("java.lang.Float") || className.equals("float")) return "0.0f";
if(className.equals("java.lang.Character") || className.equals("char")) return "' '";
if(className.equals("java.lang.Boolean") || className.equals("boolean")) return "false";
if(className.equals("java.lang.String")) return "\"\"";
return "null";
}
}