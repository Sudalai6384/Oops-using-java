import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class DiagElements
{
   public static void main(String args[])
   {    
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter row of A");
	int row1=s.nextInt();
	System.out.println("enter column of A");
	int column1=s.nextInt();
	
	
	int a[][]=new int[row1][column1];
	
	
	
		System.out.println("Enter the Elements of A");
    	 
    for (int i = 0; i < row1; i++){
	    for(int j = 0; j < column1; j++){
           	a[i][j] = s.nextInt();
	    }
	}   
	
System.out.println("The diagonal elements of Array:");
       for (int i = 0;i<row1;i++){
	    for(int j = 0;j<column1;j++){
		if(i==j){
			System.out.print(a[i][j]+" ");
            }
			else{
			System.out.print("  ");}
			}
	   System.out.println();}
	}   
	  
   
}