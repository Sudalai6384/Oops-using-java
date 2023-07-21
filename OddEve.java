import java.io.*;
import java.util.Scanner;

public class OddEve{
public static void main(String arg[]){
int a,b;

Scanner s=new Scanner(System.in);
System.out.println("enter the n1 value:");
a=s.nextInt();
System.out.println("enter the n2 value:");
b=s.nextInt();

if(a%2==0){
System.out.println("EVEN");}
else{
System.out.println("ODD");}

if(b%2==0){
System.out.println("EVEN");}
else{
System.out.println("ODD");}


}}