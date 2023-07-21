import java.io.*;
import java.util.Arrays;
public class LowTri  
{    
    public static void main(String[] args) 
	{    
    int rows, cols;     
        int a[][] = {{1, 2, 3},    
                     {4, 5, 6},    
                     {7, 8, 9}    
                    };    
             
System.out.println("Lower triangle matrix: ");    
        for(int i = 0; i < a.length; i++){    
          for(int j = 0; j <a.length; j++){    
            if(j > i){    
			System.out.print(" "); }   
            else {   
			System.out.print(a[i][j] + " "); }   
            }    
                System.out.println();}    
            
}}
