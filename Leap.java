import java.io.*;
import java.util.*;
public class Leap{
public static void main(String[] args){
int year;
Scanner s= new Scanner(System.in);
System.out.println("Enter the year:");
year=s.nextInt();
if(year%4==0){
System.out.println("the year " +year +" is a leap year");}
else{
System.out.println("the year " +year +" is not a leap year");}
}

}
