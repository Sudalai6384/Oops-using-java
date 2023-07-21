import java.io.*;
import java.util.Scanner;
 public class Indec{
 public static void main(String[]args){
 int n,b;
  
  
 Scanner s=new Scanner(System.in);
 System.out.printf("Enter the n value :");
 n=s.nextInt();
 
 int i=n;
 b=n-(n-1);
 for(i=n;i>0;i--)
 {
 System.out.printf("%d ",i);}
 
 System.out.printf("  ");
  for(i=b;i<=n;i++)
 {
 System.out.printf("%d ",i);}
 }}