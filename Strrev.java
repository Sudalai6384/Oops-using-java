import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
 
public class Strrev{
 
  public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  
  String a=s.nextLine();
  String b=s.nextLine();
   
   
   String c= a+a;
   
   if(c.contains(b))
   {
   System.out.println("Possible");}
   else{
   System.out.println("Not Possible");}
   
   }}
  