import java.io.*;
import java.util.*;
public class PosNeg{
public static void main(String[] args){
int num;
Scanner s= new Scanner(System.in);
System.out.println("Enter the integer :");
num=s.nextInt();
if(num>0){
System.out.println("the integer " +num +" is positive");}
else{
System.out.println("the integer " +num +" is negative");}
}

}
