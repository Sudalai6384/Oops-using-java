import java.io.*;
import java.util.Scanner;
 class Primefact{
 public static void main(String[]args){
 
 int n,i;
 
 Scanner s=new Scanner(System.in);
 System.out.printf("Enter the number:");
 n=s.nextInt();
 
 for(i=2;i<=n;){
 n=n/i;
 System.out.printf("%d\n",i);}
 }}