import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class SumOf2Arr
{
   public static void main(String args[])
   {    
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter row of A");
	int row1=s.nextInt();
	System.out.println("enter column of A");
	int column1=s.nextInt();
	
	System.out.println("enter row of B");
	int row2=s.nextInt();
	System.out.println("enter column of B");
	int column2=s.nextInt();
System.out.println();

	int a[][]=new int[row1][column1];
	int b[][]=new int[row2][column2];
	int c;
	
	if(row1==row2 && column1==column2){
		System.out.println("Enter the Elements of A");
    	 
    for (int i = 0; i < row1; i++){
	    for(int j = 0; j < column1; j++){
           	a[i][j] = s.nextInt();
	    }
	}   
	System.out.println("Enter the Elements of B");
	for (int i = 0; i < row2; i++){
	    for(int j = 0; j < column2; j++){
           	b[i][j] = s.nextInt();
	    }
	}   
System.out.println("The sum of Array:");
       for (int i = 0;i<row1;i++){
	    for(int j = 0;j<column1;j++){
			c= (a[i][j] + b[i][j]);
            System.out.print(c+" ");}
	   System.out.println();}
	}   
	  
   }
}