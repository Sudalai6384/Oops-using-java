import java.io.*;
import java.util.Scanner;
 public class Power{
 public static void main(String[]args){
 int b,p,i;
 
 
 Scanner s=new Scanner(System.in);
 System.out.printf("Enter the base value :");
 b=s.nextInt();
 System.out.printf("Enter the power value :");
 p=s.nextInt();
 i=1;
 while(i<p)
 {
 b=b*b;
 i++;
 }
 System.out.printf("the ans is: %d",b);
 }}
 