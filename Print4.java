import java.io.*;
import java.util.Scanner;

public class Print4{
public static void main(String arg[]){
int a,b,n,d=1,tot=0;

Scanner s=new Scanner(System.in);
System.out.println("enter the a:");
a=s.nextInt();
System.out.println("enter the b:");
b=s.nextInt();
System.out.println("enter the n:");
n=s.nextInt();
  tot=a+b;
  System.out.println(tot);
  for(int i=1;i<n;i++)
  {
   for(int j=1;j<=i;j++){
  d=d*2;
  tot=tot+(d*b);
   System.out.printf(" %d ",tot);}
   
}}}


