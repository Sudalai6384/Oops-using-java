import java.io.*;
import java.util.Scanner;
class Adder
{
  static int add(int a[][],int b[][])
  {
	  int c[][]=new int[3][3];  
  
for(int i=0;i<3;i++)
{  
for(int j=0;j<3;j++)
{  
c[i][j]=0;    
for(int k=0;k<3;k++)    
{    
c[i][j]+=a[i][k]*b[k][j];    
}
System.out.print(c[i][j]+" "); 
}
System.out.println();  
}
	  return 0;
  }
  
  
  
  
  
  class MethodOverloading1
  {
  public static void main(String[]args)
  {
  System.out.println(Adder.add({{1,1,1},{2,2,2},{3,3,3}},{{1,1,1},{2,2,2},{3,3,3}}));
  }
  }     