import java.io.*;
import java.util.Scanner;

public class Print3{
public static void main(String arg[]){
int a,b,n;

Scanner s=new Scanner(System.in);
System.out.println("enter the a:");
a=s.nextInt();
System.out.println("enter the b:");
b=s.nextInt();
System.out.println("enter the n:");
n=s.nextInt();
  
  for(int i=a;i<=n;i++)
  {
   
   b=b+(b+2);
   System.out.printf(" %d ",b);}
}}