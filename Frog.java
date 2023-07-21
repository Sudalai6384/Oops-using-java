import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Frog{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of stones:");
	int k,i;
	int flag;
	int n=s.nextInt();
	
	int stones[]=new int[n];
	for(i=0;i<n;i++){
	stones[i]=s.nextInt();}
	
	
	int diff;
	
	for(i=1;i<stones.length;i++){
	diff=(stones[i]-stones[i-1]);
	 k=diff;
      if(k==k+diff||k==k+diff+1||diff==k+diff-1){
		  flag=1;
	  
	  diff=stones[i];}
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