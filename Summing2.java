import java.io.*;
class sum3
{
  int num1;
  int num2;
  int num3;
void insertRecord(int n1,int n2,int n3)
{
     num1=n1;
	 num2=n2;
	 num3=n3;
}
void displayInformation()
{
     System.out.println("The sum is "); 
	System.out.println(num1+num2+num3);
}
	 
}
class Summing2{
public static void main(String args[])
   {
	
        sum3 p1=new sum3();
		p1.insertRecord(111,111,111);
		p1.displayInformation();
		
		
	
    }
}