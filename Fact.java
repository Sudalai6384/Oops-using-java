import java.io.*;
import java.util.Scanner;
 class Fact{
 public static void main(String[] args){
 int n;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the n value :");
 n=s.nextInt();
 int i=n,Fact=1;
 while(i>=1){
 Fact=Fact*i;
 i--;}
 System.out.printf("the factorial of %d is:%d",n,Fact);
 }}