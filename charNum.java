import java.io.*;
import java.util.*;
class charNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter string");
int count=0;
String str=sc.nextLine();
char a[]=str.toCharArray();
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(a[i]==a[j])
{
count++;
}
else
{
j++;
}
}
System.out.println(a[i]+"-"+count);
count=0;
}
}
}