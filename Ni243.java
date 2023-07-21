import java.io.*;
import java.util.Scanner;

class Ni243{
public static void main(String args[]){
int n,i,rem;
Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int c[]=new int[n];
	
	System.out.println("Enter the elements of a:");
	for(i=0;i<n;i++){
	a[i]=s.nextInt();}
	System.out.println("Enter the elements of b:");
	for(i=0;i<n;i++){
	b[i]=s.nextInt();}
	
	
	for(i=0;i<n;i++){
		if(i==0 || i==3){
		c[i]=((a[i]*b[i])+a[i]);}
		
		else if(i==1 || i==4){
		c[i]=((a[i]*b[i])-a[i]);}
		
		else if(i==2 || i==5){
		c[i]=(a[i]*b[i]);}
		
		else{
		}
	System.out.print(c[i]+" ");}
	
	System.out.println();
	
	for(i=0;i<n;i++){
		if(c[i]>9){
		System.out.print("D ");}
			else{
				System.out.print("S ");
			}
	System.out.println();}
	
	for(i=0;i<n;i++){
		rem=b[i]%a[i];
		System.out.print(rem+" ");
		}
		System.out.println();
	for(i=0;i<n;i++){
	    rem=b[i]%a[i];
		if(rem==0){
		System.out.print("N ");}
		else if(rem==1){
			System.out.print("O ");}
		else if(rem==2){
		System.out.print("E ");}
			else{
			}
		}
			
			
	
}}
	
	