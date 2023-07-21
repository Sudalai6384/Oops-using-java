import java.io.*;
import java.util.Scanner;
class Ni23{

public static void main(String args[]){

Scanner s=new Scanner(System.in);
System.out.println("Enter number of inputs:");
int n=s.nextInt();
int arr[]=new int[n];
int i,j;
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
}

for(i=0;i<arr.length;i++){
	for( j=0;j<arr.length;j++){
	if(arr[i]+arr[j]==2020)
	{
	int mul=arr[i]*arr[j];
	System.out.println("the numbers addition gives 2020:"+arr[i]+" "+arr[j]);
	System.out.println("multiplication of the numbers:"+mul);
	}
	}}
}}
