import java.io.*;
import java.util.Scanner;
class ArrSum{
public static void main(String args[]){	
int n;
Scanner s = new Scanner(System.in);
System.out.println("Enter num of elements");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array:");

for(int i=0;i<n;i++){
a[i]=s.nextInt();}
System.out.println("the sum of all elements :");
int Sum=0;

for(int i=0;i<n;i++){
Sum=Sum+a[i];}
System.out.println(Sum);
}}