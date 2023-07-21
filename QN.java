import java.io.*;
import java.util.Scanner;

class QN{
public static void main(String args[]){
int sum=0;
int product=1;
Scanner s= new Scanner(System.in);
System.out.println("Enter N value:");
int N=s.nextInt();
System.out.println("Enter Q as 1 or 2 :");
int Q=s.nextInt();

if(Q==1){
	for(int i=1;i<=N;i++){
	sum=sum+i;
	}
	System.out.println(sum);}
	else if(Q==2){
	for(int i=1;i<=N;i++){
	product=product*i;}
		System.out.println(product);}
		else{
				System.out.println("Invalid");}
				}}

		

	
	
	