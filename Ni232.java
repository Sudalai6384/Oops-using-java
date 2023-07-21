import java.io.*;
import java.util.Scanner;
class Ni232{

public static void main(String args[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter number of inputs:");
int n=s.nextInt();
int i,d,m;
int count=0;

int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
}

for(i=0;i<n;i++)
{
d=arr[i]/3;
m=d-2;
System.out.println(m);
count=count+m;}
System.out.println("ans:"+count);
}}
