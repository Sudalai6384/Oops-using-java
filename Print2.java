import java.io.*;
import java.util.Scanner;

public class Print2{
public static void main(String arg[]){
int num;

Scanner s=new Scanner(System.in);
System.out.println("enter the num:");
num=s.nextInt();
  
  for(int i=num;i<=10;i++)
  {
   
   num=num+(num+2);
   System.out.printf(" %d ",num);}
}}