package com.thinking.machines.util;
import java.io.*;
public class PWPrintln
{
public static void main(String gg[])
{
try
{
String fileName=gg[0];
File file=new File(fileName);
if(file.exists()==false)
{
System.out.println("File :"+fileName+"does not exists.");
return;
}
RandomAccessFile raf;
raf=new RandomAccessFile(file,"rw");
File tmpFile=new File("tmp.tmp");
if(tmpFile.exists()) tmpFile.delete();
RandomAccessFile tmpRaf;
tmpRaf=new RandomAccessFile("tmp.tmp","rw");
String line;
while(raf.getFilePointer()<raf.length())
{
line=raf.readLine();
line=line.replaceAll("\"","\\\\\"");
tmpRaf.writeBytes("pw.println(\""+line+"\");\r\n");
}
raf.close();
tmpRaf.close();
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}