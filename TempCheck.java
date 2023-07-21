import java.io.*;
import java.util.Scanner;
 public class TempCheck{
  public static void main(String arg[]){
   int Temp;
   System.out.println("Enter the Temperature:");
   Scanner s=new Scanner(System.in);
   Temp=s.nextInt();
   if(Temp<0){
    System.out.println("Freezing weather");
   } else if (Temp<10) {
    System.out.println("Very Cold weather");
   }
   else if (Temp<20) {
    System.out.println("Cold weather");
   }
   else if (Temp<30) {
       System.out.println("Normal in Temp");
   }
    else if(Temp<40){
     System.out.println("Its Hot");
    }
    else {
     System.out.println("Its Very Hot");
    }
   }

 }