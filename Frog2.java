import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Frog2{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of stones:");
	int k,i;
	int flag=0;
	int n=s.nextInt();
	
	int stones[]=new int[n];
	for(i=0;i<n;i++){
	stones[i]=s.nextInt();}
	
	
	int diff;
	
	for(i=1;i<stones.length;i++){
	diff=(stones[i]-stones[i-1]);
	 k=diff;
      if(stones[i]==stones[i-1]+k||stones[i]==stones[i-1]+k+1||stones[i]==stones[i-1]+k-1){
		  flag=1;
	  }
	  else
	  {
	  flag=0;
	  }
	  break;
	  
	  }
	  
	  if(flag==1){
	  System.out.println("true");}
		  else{
		  System.out.println("false");}
	  
}}