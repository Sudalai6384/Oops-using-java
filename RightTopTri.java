import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class RightTopTri{
   
   public static void main(String args[])
   {    
   Scanner s=new Scanner(System.in);
	System.out.println("enter row of A");
	int row=s.nextInt();
	System.out.println("enter column of A");
	int column=s.nextInt();
	
	int a[][]=new int[row][column];
	
			System.out.println("Enter the Elements of A");
    	 
    for (int i=0;i<row;i++){
	    for(int j=0;j<column;j++){
           	a[i][j] = s.nextInt();
	    }
	}  
         	System.out.println("the matrix of A :");

for (int i = 0;i<row;i++){
	    for(int j = 0;j<column;j++){
         System.out.print(a[i][j]+" ");}
System.out.println();}


System.out.println("the right top triangle form :");
	for (int i = 0;i<row;i++){
	    for(int j = 0;j<column;j++){
		if(j>=i){
         System.out.print(a[i][j]+" ");}}
System.out.println();}

}}